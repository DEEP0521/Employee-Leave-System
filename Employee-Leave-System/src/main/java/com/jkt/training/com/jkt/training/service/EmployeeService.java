package com.jkt.training.service;
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
	
	public List<Employee> getAllEmployees()
	{
		return emprepo.findAll();
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
	
	public void deleteEmp(int EmpId)
	{
		Employee emp=emprepo.getOne(EmpId);
		emprepo.delete(emp);
	}
}
