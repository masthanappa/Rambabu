package com.kn.crud.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
@Id
int lap_id;
String lap_brand;
double lap_price;
public Laptop() {
}
public Laptop(int lap_id, String lap_brand, double lap_price) {
	this.lap_id = lap_id;
	this.lap_brand = lap_brand;
	this.lap_price = lap_price;
}
public int getLap_id() {
	return lap_id;
}
public void setLap_id(int lap_id) {
	this.lap_id = lap_id;
}
public String getLap_brand() {
	return lap_brand;
}
public void setLap_brand(String lap_brand) {
	this.lap_brand = lap_brand;
}
public double getLap_price() {
	return lap_price;
}
public void setLap_price(double lap_price) {
	this.lap_price = lap_price;
}
@Override
public String toString() {
	return "Laptop [lap_id=" + lap_id + ", lap_brand=" + lap_brand + ", lap_price=" + lap_price + "]";
}


}
