package com.jkt.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LeaveTrack{

	int lid;
	int used,remaining;
	String type,date_off;
	
	@ManyToOne
	private Employee employee;
	
	public LeaveTrack() {}

	

	public LeaveTrack(int lid, int used, int remaining, String type, String date_off, Employee employee) {
		super();
		this.lid = lid;
		this.used = used;
		this.remaining = remaining;
		this.type = type;
		this.date_off = date_off;
		this.employee = employee;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate_off() {
		return date_off;
	}

	public void setDate_off(String date_off) {
		this.date_off = date_off;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
