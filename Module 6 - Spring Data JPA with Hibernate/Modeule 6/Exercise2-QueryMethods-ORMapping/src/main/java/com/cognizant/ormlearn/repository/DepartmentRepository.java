package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.ormlearn.model.Department;

// Repository for Department CRUD; JpaRepository handles findById and save
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
