package com.kn.crud.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// creat();
		read();
		// update();
		delet();
	}

	private static void delet() {
		Configuration con = new Configuration().configure();
		SessionFactory fac = con.buildSessionFactory();
		Session ses = fac.openSession();
		Transaction txt = ses.beginTransaction();
		Laptop laptop = ses.load(Laptop.class, 222);
		ses.delete(laptop);

		txt.commit();
		// System.out.println("==>Laptop has been created - "+laptop);
	}

	private static void update() {
		Configuration con = new Configuration().configure();
		SessionFactory fac = con.buildSessionFactory();
		Session ses = fac.openSession();
		Transaction txt = ses.beginTransaction();
		Laptop laptop = ses.load(Laptop.class, 111);
		laptop.setLap_price(256894.25);

		txt.commit();
		System.out.println("==>Laptop has been created - " + laptop);
	}

	private static void read() {
		Configuration con = new Configuration().configure();
		SessionFactory fac = con.buildSessionFactory();
		Session ses = fac.openSession();
		Transaction txt = ses.beginTransaction();
		Laptop laptop = ses.get(Laptop.class, 111);
		Laptop laptop1 = ses.get(Laptop.class, 222);
		txt.commit();
		System.out.println("==>Laptop has been created - " + laptop);
		System.out.println("==>Laptop has been created - " + laptop1);
	}

	private static void creat() {
		Laptop laptop = new Laptop(111, "Dell", 256555.25);
		Laptop laptop1 = new Laptop(222, "HP", 126555.25);
		Configuration con = new Configuration().configure();
		SessionFactory fac = con.buildSessionFactory();
		Session ses = fac.openSession();
		Transaction txt = ses.beginTransaction();
		ses.save(laptop);
		ses.save(laptop1);
		txt.commit();
		System.out.println("==>Laptop has been created - " + laptop);
		System.out.println("==>Laptop has been created - " + laptop1);
	}

}
