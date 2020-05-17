package com.jkt.training.com.jkt.training.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
  @Id
   private int EmpId;
   private String EmpName;
   private String EmpDept;
   private String DateOfJoining;
   
	public Employee()
      {
	   super();
      }
   
   public Employee(int empId, String empName, String empDept, String dateOfJoining) {
	super();
	EmpId = empId;
	EmpName = empName;
	EmpDept = empDept;
	DateOfJoining = dateOfJoining;
    }
	
   public int getEmpId() {
	return EmpId;
   }
   public void setEmpId(int empId) {
	EmpId = empId;
   }
   public String getEmpName() {
	return EmpName;
   }
   public void setEmpName(String empName) {
	EmpName = empName;
   }
   public String getEmpDept() {
	return EmpDept;
   }
   public void setEmpDept(String empDept) {
	EmpDept = empDept;
   }
   public String getDateOfJoining() {
	return DateOfJoining;
   }
   public void setDateOfJoining(String dateOfJoining) {
	DateOfJoining = dateOfJoining;
   }
@Override
public String toString() {
	return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + ", DateOfJoining="
			+ DateOfJoining + "]";
}
}
