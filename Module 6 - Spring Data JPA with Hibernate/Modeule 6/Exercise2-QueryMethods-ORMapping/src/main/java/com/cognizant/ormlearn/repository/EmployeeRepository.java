package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.ormlearn.model.Employee;

// Repository for Employee CRUD operations; inherits all JpaRepository methods
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // findById(id) and save(employee) are provided by JpaRepository
}
