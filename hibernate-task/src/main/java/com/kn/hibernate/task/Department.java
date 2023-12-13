package com.kn.hibernate.task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
@Id
int dep_Id;
String dep_Name;
public Department() {
}
public Department(int dep_Id, String dep_Name) {
	this.dep_Id = dep_Id;
	this.dep_Name = dep_Name;
}
public int getDep_Id() {
	return dep_Id;
}
public void setDep_Id(int dep_Id) {
	this.dep_Id = dep_Id;
}
public String getDep_Name() {
	return dep_Name;
}
public void setDep_Name(String dep_Name) {
	this.dep_Name = dep_Name;
}
@Override
public String toString() {
	return "Department [dep_Id=" + dep_Id + ", dep_Name=" + dep_Name + "]";
}

}
