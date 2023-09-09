package com.example.lab4_20193315.repository;


import com.example.lab4_20193315.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
