package com.jkt.training.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jkt.training.model.Employee;
import com.jkt.training.model.Manager;
import com.jkt.training.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empser;
	
	@PostMapping(path="/employees",consumes = "application/json")
	public String addEmp(@RequestBody Employee employee)
	{
		empser.addEmp(employee);
		System.out.println(employee.toString());
		return "New Employee Added";
	}
	
	//mapping
	@PostMapping("/managers/{mId}/employees")
	public String addmanager(@RequestBody Employee employee,@PathVariable int mId)
	{
		employee.setManager(new Manager(mId,"",""));
		empser.addMan(employee);
		return "manager added";
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return empser.getAllEmployees();
	}
	
	//mapping
	@GetMapping("/manager/{mid}/employees")
	public List<Employee> getAllEmployee(@PathVariable int mid)
	{
		return empser.getAllEmployByManagerId(mid);
	}
	
	@GetMapping("/employees/{EmpId}")
	public Optional<Employee> getEmpbyId(@PathVariable int EmpId)
	{
		return empser.getEmpbyId(EmpId);
	}
	
	
	@PutMapping(path="/employees/{EmpId}",consumes="application/json")
	public String updateEmp(@RequestBody Employee emp, @PathVariable int EmpId)
	{
		empser.updateEmp(emp, EmpId);
		return "Employee Updated";
	}
	
	//mapping
	@PutMapping(path="/managers/{mid}/employees/{EmpId}",consumes="application/json")
	public String updateEmploy(@RequestBody Employee emp,@PathVariable int mid ,@PathVariable int EmpId)
	{
		emp.setManager(new Manager(mid,"",""));
		empser.updateEmpl(emp, EmpId);;
		return "Employee Updated";
	}
	
	@DeleteMapping("/employees/{EmpId}")
	public String deleteEmp(@PathVariable int EmpId)
	{
		empser.deleteEmp(EmpId);
		return "Employee deleted";
	}
	
	//mapping
	@DeleteMapping("/managers/{mid}/employees/{EmpId}")
	public String deleteEmpl(@PathVariable int EmpId)
	{
		empser.deleteEmp(EmpId);
		return "Employee deleted";
	}
}
