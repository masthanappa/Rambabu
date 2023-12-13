package com.kn.manytomany1.dt;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
@Id
int enp_id;
String emp_name;
char emp_team;
@ManyToMany
List<Technology> technologies;
public Employee() {
}
public Employee(int enp_id, String emp_name, char emp_team, List<Technology> technologies) {
	this.enp_id = enp_id;
	this.emp_name = emp_name;
	this.emp_team = emp_team;
	this.technologies = technologies;
}
public int getEnp_id() {
	return enp_id;
}
public void setEnp_id(int enp_id) {
	this.enp_id = enp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public char getEmp_team() {
	return emp_team;
}
public void setEmp_team(char emp_team) {
	this.emp_team = emp_team;
}
public List<Technology> getTechnologies() {
	return technologies;
}
public void setTechnologies(List<Technology> technologies) {
	this.technologies = technologies;
}
@Override
public String toString() {
	return "Employee [enp_id=" + enp_id + ", emp_name=" + emp_name + ", emp_team=" + emp_team + ", technologies="
			+ technologies + "]";
}


}
