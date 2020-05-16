package com.jkt.training.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeaveTrack{

	int lid;
	int used,remaining;
	String type;
	
	
	public LeaveTrack() {}

	public LeaveTrack(int lid, int used, int remaining, String type) {
		super();
		this.lid = lid;
		this.used = used;
		this.remaining = remaining;
		this.type = type;
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
	
}
