package com.jkt.training.com.jkt.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jkt.training.com.jkt.training.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByManagerId(int Id);
}
