package com.mapping.dt;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {
	@Id
int regNumber;
String model;
double price;
@OneToOne
Studentes studentes;
public Bike() {
}
public Bike(int regNumber, String model, double price, Studentes studentes) {
	this.regNumber = regNumber;
	this.model = model;
	this.price = price;
	this.studentes = studentes;
}
public int getRegNumber() {
	return regNumber;
}
public void setRegNumber(int regNumber) {
	this.regNumber = regNumber;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Studentes getStudentes() {
	return studentes;
}
public void setStudentes(Studentes studentes) {
	this.studentes = studentes;
}
@Override
public String toString() {
	return "Bike [regNumber=" + regNumber + ", model=" + model + ", price=" + price + ", studentes=" + studentes + "]";
}


}
