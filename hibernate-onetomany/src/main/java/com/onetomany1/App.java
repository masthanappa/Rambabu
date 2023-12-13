package com.onetomany1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.dt.Custmer;
import com.onetomany.dt.Product;

public class App {

	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		List<Product> list1=new ArrayList<Product>();
		list1.add(p1);
		list1.add(p2);
		
		List<Product> list2=new ArrayList<Product>();
		list2.add(p3);
		list2.add(p4);
		
		Custmer c1=new Custmer(1, "Ram", 25, list1);
		Custmer c2=new Custmer(2, "Shyam", 26, list2);
		
		p1.setProd_id(11);
		p1.setProd_name("KeyBord");
		p1.setProd_cost(1100);
		p1.setCustmer(c1);
		
		
		p2.setProd_id(22);
		p2.setProd_name("Mouse");
		p2.setProd_cost(900);
		p2.setCustmer(c1);
		
		p3.setProd_id(33);
		p3.setProd_name("TV");
		p3.setProd_cost(21000);
		p3.setCustmer(c2);
		
		p4.setProd_id(44);
		p4.setProd_name("Camera");
		p4.setProd_cost(111000);
		p4.setCustmer(c2);
		
		
		Configuration con=new Configuration();
		con.configure();
		
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		  Transaction txn=session.beginTransaction();
		  
		  session.save(c1);
		  session.save(c2);
		  session.save(p1);
		  session.save(p2);
		  session.save(p3);
		  session.save(p4);
		  
		  txn.commit();
		  
		  System.out.println(" ===> done");
		  
		}

}
