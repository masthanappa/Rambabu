package com.kn.hibernate.task;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	int empID;
	String emp_Name;
	int emp_Salary;
	public Employee() {
	}
	public Employee(int empID, String emp_Name, int emp_Salary) {
		this.empID = empID;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public int getEmp_Salary() {
		return emp_Salary;
	}
	public void setEmp_Salary(int emp_Salary) {
		this.emp_Salary = emp_Salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", emp_Name=" + emp_Name + ", emp_Salary=" + emp_Salary + "]";
	}
	
}
