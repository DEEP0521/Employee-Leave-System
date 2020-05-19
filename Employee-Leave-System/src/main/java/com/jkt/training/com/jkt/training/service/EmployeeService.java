package com.jkt.training.com.jkt.training.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkt.training.com.jkt.training.model.Employee;
import com.jkt.training.com.jkt.training.repository.EmployeeRepository;
@Service
public class EmployeeService {
  @Autowired
   private EmployeeRepository emprepo;
	
	public void addEmp(Employee employee)
	{
		emprepo.save(employee);
	}
	
	//mapping
	public void addMan(Employee employee)
	{
		emprepo.save(employee);
	}
	public List<Employee> getAllEmployees()
	{
		return emprepo.findAll();
	}
	
	//mapping
	public List<Employee> getAllEmployByManagerId(int id)
	{
		List<Employee> employee=new ArrayList<>();
		emprepo.findByManagerId(id).forEach(employee::add);
		return employee;
	}
	//emp by id
	public Optional<Employee> getEmpbyId(int EmpId)
	{
		Optional<Employee> emp = emprepo.findById(EmpId);
		return emp;
		
	}
	
	
	
	public void updateEmp(Employee emp,int EmpId)
	{
	
		if(emprepo.existsById(EmpId))
			emprepo.save(emp);
	
	}
	
	//mapping
	public void updateEmpl(Employee emp,int EmpId)
	{
	
		if(emprepo.existsById(EmpId))
			emprepo.save(emp);
	
	}
	
	
	public void deleteEmp(int EmpId)
	{
		Employee emp=emprepo.getOne(EmpId);
		emprepo.delete(emp);
	}
	
	//mapping
	public void deleteEmployee(int EmpId)
	{
		Employee emp=emprepo.getOne(EmpId);
		emprepo.delete(emp);
	}
}