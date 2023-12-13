package com.mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.dt.Bike;
import com.mapping.dt.Studentes;

public class App {

	public static void main(String[] args) {    
      // Bike b1=new Bike(111, "KTM", 256522, 2);
       //Bike b2=new Bike(222, "Yamaha", 556555,s3);
       //Bike b3=new Bike(333, "Royal enfield", 856555,s1);
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		
       Studentes s1=new Studentes(1, "Ram", 85, b3);
       Studentes s2=new Studentes(2, "Shyam", 85, b1);
       Studentes s3=new Studentes(3, "Ravi", 85, b2);
        
      b1.setRegNumber(111);
      b1.setModel("KTM");
      b1.setPrice(236558.23);
      b1.setStudentes(s2);
      
      b2.setRegNumber(222);
      b2.setModel("Yamaha");
      b2.setPrice(336558.23);
      b2.setStudentes(s3);
      
      b3.setRegNumber(333);
      b3.setModel("Royal Enfield");
      b3.setPrice(436558.23);
      b3.setStudentes(s1);
       
       Configuration con=new Configuration();
       con.configure();
       SessionFactory factory=con.buildSessionFactory();
       Session session=factory.openSession();
       Transaction txn=session.beginTransaction();
       session.save(s1);
       session.save(s2);
       session.save(s3);
       session.save(b1);
       session.save(b2);
       session.save(b3);
       txn.commit();
      System.out.println("==>Done");
	}

}
