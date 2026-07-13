package com.cognizant.ormlearn;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static EmployeeService employeeService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        employeeService = context.getBean(EmployeeService.class);
        LOGGER.info("Inside main");

        testGetAllPermanentEmployees();
        testGetAllPermanentEmployeesWithFetch();
        testGetEmployeesAboveSalary();
        testGetAllEmployeesSortedByName();
    }

    // HQL: get permanent employees (basic)
    private static void testGetAllPermanentEmployees() {
        LOGGER.info("Start");
        List<Employee> employees = employeeService.getAllPermanentEmployees();
        LOGGER.debug("Permanent Employees={}", employees);
        employees.forEach(e -> LOGGER.debug("Skills={}", e.getSkillList()));
        LOGGER.info("End");
    }

    // HQL with fetch: single query loads department + skills
    private static void testGetAllPermanentEmployeesWithFetch() {
        LOGGER.info("Start");
        List<Employee> employees = employeeService.getAllPermanentEmployeesWithFetch();
        LOGGER.debug("Permanent Employees={}", employees);
        employees.forEach(e -> LOGGER.debug("Dept={}, Skills={}", e.getDepartment(), e.getSkillList()));
        LOGGER.info("End");
    }

    // Native SQL: employees earning above 70000
    private static void testGetEmployeesAboveSalary() {
        LOGGER.info("Start");
        List<Employee> employees = employeeService.getEmployeesAboveSalary(70000);
        LOGGER.debug("Employees above 70000={}", employees);
        LOGGER.info("End");
    }

    // Native SQL: all employees sorted A-Z by name
    private static void testGetAllEmployeesSortedByName() {
        LOGGER.info("Start");
        List<Employee> employees = employeeService.getAllEmployeesSortedByName();
        LOGGER.debug("Employees sorted={}", employees);
        LOGGER.info("End");
    }
}
