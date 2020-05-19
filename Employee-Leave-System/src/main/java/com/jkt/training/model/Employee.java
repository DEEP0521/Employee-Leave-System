package com.jkt.training.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private int id;
	
	private String empName;
	private String empDept;
	private String dateOfJoining;
	   
	   @ManyToOne
	   private Manager manager;
	   
		public Employee()
	      {
		   super();
	      }

		public Employee(int id, String empName, String empDept, String dateOfJoining) {
			super();
			this.id = id;
			this.empName = empName;
			this.empDept = empDept;
			this.dateOfJoining = dateOfJoining;
		}
		
		

		public Employee(int id, String empName, String empDept, String dateOfJoining, int  manager_Id) {
			super();
			this.id = id;
			this.empName = empName;
			this.empDept = empDept;
			this.dateOfJoining = dateOfJoining;
			this.manager =new Manager(manager_Id,"","");
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpDept() {
			return empDept;
		}

		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}

		public String getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(String dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public Manager getManager() {
			return manager;
		}

		public void setManager(Manager manager) {
			this.manager = manager;
		}   	
}
