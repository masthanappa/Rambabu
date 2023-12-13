package com.onetomany.dt;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Custmer {
@Id
int id;
String name;
int age;
@OneToMany
List<Product> products;
public Custmer() {
}
public Custmer(int id, String name, int age, List<Product> products) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.products = products;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Custmer [id=" + id + ", name=" + name + ", age=" + age + ", products=" + products + "]";
}


}
