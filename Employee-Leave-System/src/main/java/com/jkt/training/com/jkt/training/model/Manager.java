package com.jkt.training.com.jkt.training.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	
	@Id
	private int id;
	private String manager_Name;
	private String manager_Project;
	
	
	public Manager() {
		super();
	
	}


	
	


	public Manager(int id, String manager_Name, String manager_Project) {
		super();
		this.id = id;
		this.manager_Name = manager_Name;
		this.manager_Project = manager_Project;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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


}
