package com.cognizant.ormlearn.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cognizant.ormlearn.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // HQL: get all permanent employees using Java field name 'permanent'
    @Query("SELECT e FROM Employee e WHERE e.permanent = 1")
    List<Employee> getAllPermanentEmployees();

    // HQL optimized: fetch joins load department + skills in a single SQL query
    @Query("SELECT e FROM Employee e LEFT JOIN FETCH e.department LEFT JOIN FETCH e.skillList WHERE e.permanent = 1")
    List<Employee> getAllPermanentEmployeesWithFetch();

    // Native SQL: filter employees by salary using raw SQL column name
    @Query(value = "SELECT * FROM employee WHERE em_salary > :salary", nativeQuery = true)
    List<Employee> getEmployeesAboveSalary(double salary);

    // Native SQL: sort all employees alphabetically using SQL ORDER BY
    @Query(value = "SELECT * FROM employee ORDER BY em_name ASC", nativeQuery = true)
    List<Employee> getAllEmployeesSortedByName();
}
