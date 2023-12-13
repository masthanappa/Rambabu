package com.kn.hibernate.task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
	public static void main(String[] args) {
		Employee e1=new Employee(1, "Ram", 250000);
		Employee e2=new Employee(2, "Ravi", 450000);
		Employee e3=new Employee(3, "Shyam", 350000);
		Department d1=new Department(101, "IT Department");
		Department d2=new Department(102, "electrical Department");
		Department d3=new Department(103, "Mechanical Department");
		 Configuration cfg=new Configuration();
	       cfg.configure();
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       Transaction txn=session.beginTransaction();
	       session.save(e1);
	       session.save(e2);
	       session.save(e3);
	       session.save(d1);
	       session.save(d2);
	       session.save(d3);
	       txn.commit();
	       
	       System.out.println("---> "+e1+" has been stored in database !");
	       System.out.println("---> "+e2+" has been stored in database !");
	       System.out.println("---> "+e3+" has been stored in database !");
	       System.out.println("---> "+d1+" has been stored in database !");
	       System.out.println("---> "+d2+" has been stored in database !");
	       System.out.println("---> "+d3+" has been stored in database !");
	}

}
