package com.jkt.training.com.jkt.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jkt.training.com.jkt.training.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
