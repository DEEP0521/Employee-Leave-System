package com.jkt.training.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int EmpId;
	
	private String EmpName,EmpDept;
	private String DateOfJoining;
	
	public Employee() 
	{ 
		super();
	}
	
	public Employee(int empId, String empName, String empDept, String dateOfJoining)
	{
	super();
	EmpId = empId;
	EmpName = empName;
	EmpDept = empDept;
	DateOfJoining = dateOfJoining;
	}
	public String getEmpName() 
	{
		return EmpName;
	}
	public void setEmpName(String EmpName) 
	{
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
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
@Override
public String toString() {
	return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + ", DateOfJoining="
			+ DateOfJoining + "]";
}
   	
}
