package com.jkt.training.com.jkt.training.model;

import javax.persistence.Entity;

@Entity
public class Manager {
	
	private int manager_Id;
	private int manager_Name;
	private int manager_Project;
	
	
	
	public Manager() {
		super();
	
	}



	public Manager(int manager_Id, int manager_Name, int manager_Project) {
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



	public int getManager_Name() {
		return manager_Name;
	}



	public void setManager_Name(int manager_Name) {
		this.manager_Name = manager_Name;
	}



	public int getManager_Project() {
		return manager_Project;
	}



	public void setManager_Project(int manager_Project) {
		this.manager_Project = manager_Project;
	}
	
	

}
