package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.*;
import com.cognizant.ormlearn.service.*;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;
    private static StockService stockService;
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService    = context.getBean(CountryService.class);
        stockService      = context.getBean(StockService.class);
        employeeService   = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService      = context.getBean(SkillService.class);
        LOGGER.info("Inside main");

        testCountryContaining();
        testCountrySorted();
        testCountryStartingWith();
        testStockByDate();
        testGetEmployee();
        testAddEmployee();
        testUpdateEmployee();
        testGetDepartment();
        testAddSkillToEmployee();
    }

    // Hands-on 1: countries containing 'ou'
    private static void testCountryContaining() {
        LOGGER.info("Start");
        List<Country> list = countryService.searchByName("ou");
        LOGGER.debug("countries={}", list);
        LOGGER.info("End");
    }

    // Hands-on 1: countries containing 'ou', sorted A-Z
    private static void testCountrySorted() {
        LOGGER.info("Start");
        List<Country> list = countryService.searchByNameSorted("ou");
        LOGGER.debug("sorted={}", list);
        LOGGER.info("End");
    }

    // Hands-on 1: countries starting with 'Z'
    private static void testCountryStartingWith() {
        LOGGER.info("Start");
        List<Country> list = countryService.searchByStartingLetter("Z");
        LOGGER.debug("countries={}", list);
        LOGGER.info("End");
    }

    // Hands-on 2: FB stock data for September 2019
    private static void testStockByDate() {
        LOGGER.info("Start");
        List<Stock> list = stockService.getByCodeAndDate(
            "FB", LocalDate.of(2019, 9, 1), LocalDate.of(2019, 9, 30));
        LOGGER.debug("stocks={}", list);
        LOGGER.info("End");
    }

    // Hands-on 3: get employee with department (ManyToOne)
    private static void testGetEmployee() {
        LOGGER.info("Start");
        Employee emp = employeeService.get(1);
        LOGGER.debug("Employee={}", emp);
        LOGGER.debug("Department={}", emp.getDepartment());
        LOGGER.debug("Skills={}", emp.getSkillList());
        LOGGER.info("End");
    }

    // Hands-on 3: add a new employee linked to department
    private static void testAddEmployee() {
        LOGGER.info("Start");
        Employee emp = new Employee();
        emp.setName("David");
        emp.setSalary(new BigDecimal("72000"));
        emp.setPermanent(true);
        emp.setDateOfBirth(LocalDate.of(1992, 6, 25));
        emp.setDepartment(departmentService.get(1));
        employeeService.save(emp);
        LOGGER.debug("Added={}", emp);
        LOGGER.info("End");
    }

    // Hands-on 3: update employee's department
    private static void testUpdateEmployee() {
        LOGGER.info("Start");
        Employee emp = employeeService.get(1);
        emp.setDepartment(departmentService.get(2));
        employeeService.save(emp);
        LOGGER.debug("Updated={}", emp);
        LOGGER.info("End");
    }

    // Hands-on 4: get department with its employee list (OneToMany)
    private static void testGetDepartment() {
        LOGGER.info("Start");
        Department dept = departmentService.get(1);
        LOGGER.debug("Department={}", dept);
        LOGGER.debug("Employees={}", dept.getEmployeeList());
        LOGGER.info("End");
    }

    // Hands-on 5: add a skill to an employee (ManyToMany)
    private static void testAddSkillToEmployee() {
        LOGGER.info("Start");
        Employee emp = employeeService.get(2);
        Skill skill = skillService.get(3);
        emp.getSkillList().add(skill);
        employeeService.save(emp);
        LOGGER.debug("Employee with skill={}", emp);
        LOGGER.info("End");
    }
}
