package com.jkt.training.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String EmpName;
	private String EmpDept;
	private String DateOfJoining;
   
public Employee() {
	super();
}
public Employee(int id, String EmpName, String EmpDept, String DateOfJoining) {
	super();
	this.id = id;
	this.EmpName = EmpName;
	this.EmpDept = EmpDept;
	this.DateOfJoining = DateOfJoining;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String EmpName) {
	this.EmpName = EmpName;
}
public String getEmpDept() {
	return EmpDept;
}
public void setEmpDept(String EmpDept) {
	this.EmpDept = EmpDept;
}
public String getDateOfJoining() {
	return DateOfJoining;
}
public void setDateOfJoining(String DateOfJoining) {
	this.DateOfJoining = DateOfJoining;
}

public int getEmpId() {
	return id;
}
public void setEmpId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [EmpId=" + id + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + ", DateOfJoining="
			+ DateOfJoining + "]";
}
   	
}
