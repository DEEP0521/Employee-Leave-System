package com.jkt.training.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
<<<<<<< HEAD:Employee-Leave-System/src/main/java/com/jkt/training/model/Employee.java
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
=======
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
>>>>>>> b65eadecf86edb634a277f6d120101b040ae8fc4:Employee-Leave-System/src/main/java/com/jkt/training/com/jkt/training/model/Employee.java
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
<<<<<<< HEAD:Employee-Leave-System/src/main/java/com/jkt/training/model/Employee.java

=======
>>>>>>> b65eadecf86edb634a277f6d120101b040ae8fc4:Employee-Leave-System/src/main/java/com/jkt/training/com/jkt/training/model/Employee.java
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
