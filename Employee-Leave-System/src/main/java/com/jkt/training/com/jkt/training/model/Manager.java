package com.jkt.training.com.jkt.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Manager {
	
	@Id
	private int manager_Id;
	private String manager_Name;
	private String manager_Project;
	
	@OneToMany
	@JoinColumn(name="ME_fid",referencedColumnName = "manager_Id")
	private List <Employee> employee=new ArrayList<>();
	
	public Manager() {
		super();
	
	}





	





	public Manager(int manager_Id, String manager_Name, String manager_Project, int EmpId) {
		super();
		this.manager_Id = manager_Id;
		this.manager_Name = manager_Name;
		this.manager_Project = manager_Project;
		this.employee = (List<Employee>) new Employee(EmpId,"","","");
	}











	public Manager(int manager_Id, String manager_Name, String manager_Project) {
		super();
		this.manager_Id = manager_Id;
		this.manager_Name = manager_Name;
		this.manager_Project = manager_Project;
	}



	public int getManager_Id() {
		return manager_Id;
	}



	public void setManager_Id(int manager_Id) {
		this.manager_Id = manager_Id;
	}



	public String getManager_Name() {
		return manager_Name;
	}



	public void setManager_Name(String manager_Name) {
		this.manager_Name = manager_Name;
	}



	public String getManager_Project() {
		return manager_Project;
	}



	public void setManager_Project(String manager_Project) {
		this.manager_Project = manager_Project;
	}











	public List<Employee> getEmployee() {
		return employee;
	}











	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
