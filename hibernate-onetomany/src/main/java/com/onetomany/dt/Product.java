package com.onetomany.dt;

import jakarta.persistence.*;

@Entity
public class Product {
@Id
int prod_id;
String prod_name;
double prod_cost;

@ManyToOne
Custmer custmer;

public Product() {
}

public Product(int prod_id, String prod_name, double prod_cost, Custmer custmer) {
	this.prod_id = prod_id;
	this.prod_name = prod_name;
	this.prod_cost = prod_cost;
	this.custmer = custmer;
}

public int getProd_id() {
	return prod_id;
}

public void setProd_id(int prod_id) {
	this.prod_id = prod_id;
}

public String getProd_name() {
	return prod_name;
}

public void setProd_name(String prod_name) {
	this.prod_name = prod_name;
}

public double getProd_cost() {
	return prod_cost;
}

public void setProd_cost(double prod_cost) {
	this.prod_cost = prod_cost;
}

public Custmer getCustmer() {
	return custmer;
}

public void setCustmer(Custmer custmer) {
	this.custmer = custmer;
}

@Override
public String toString() {
	return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_cost=" + prod_cost + ", custmer="
			+ custmer + "]";
}


}
