package com.kn.manytomany2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kn.manytomany1.dt.Employee;
import com.kn.manytomany1.dt.Technology;

public class App {

	public static void main(String[] args) {
//       Employee e1=new Employee();
//       Employee e2=new Employee();
//       Employee e3=new Employee();
//       Employee e4=new Employee();
//       Employee e5=new Employee();
       Technology t1=new Technology();
       Technology t2=new Technology();
       Technology t3=new Technology();
       Technology t4=new Technology();
       
       List<Technology> list1=new ArrayList<Technology>();
       list1.add(t1);
       list1.add(t2);
       list1.add(t3);
       list1.add(t4);
       List<Technology> list2=new ArrayList<Technology>();
       list2.add(t1);
       list2.add(t2);
       list2.add(t3);
       List<Technology> list3=new ArrayList<Technology>();
       list3.add(t2);
       list3.add(t3);
       List<Technology> list4=new ArrayList<Technology>();
       list4.add(t1);
       list4.add(t4);
       list4.add(t3);
       List<Technology> list5=new ArrayList<Technology>();
       list5.add(t4);
       list5.add(t3);
       
       
       Employee e1=new Employee(1, "Ram", 'c', list4);
       Employee e2=new Employee(2, "Shyam", 'b', list3);
       Employee e3=new Employee(3, "Amith", 'a', list2);
       Employee e4=new Employee(4, "Ankith", 'b', list5);
       Employee e5=new Employee(5, "Sonu", 'a', list1);
       
       List<Employee> list6=new ArrayList<Employee>();
       list6.add(e1);
       list6.add(e5);
       list6.add(e3);
       
       List<Employee> list7=new ArrayList<Employee>();
       list7.add(e2);
       list7.add(e5);
       list7.add(e3);
       
       List<Employee> list8=new ArrayList<Employee>();
       list8.add(e2);
       list8.add(e4);
       list8.add(e3);
       list8.add(e5);
       
       List<Employee> list9=new ArrayList<Employee>();
       list9.add(e1);
       list9.add(e5);
       list9.add(e4);
       
       
       

       t1.setTech_id(111);
       t1.setTech_name("Java");
       t1.setEmployees(list6);
       
       t2.setTech_id(222);
       t2.setTech_name("Python");
       t2.setEmployees(list7);
       
       t3.setTech_id(333);
       t3.setTech_name("MySQL");
       t3.setEmployees(list8);
//       
       t4.setTech_id(444);
       t4.setTech_name("React");
       t4.setEmployees(list9);
       
       
       Configuration con=new Configuration();
       con.configure();
       SessionFactory  factory=con.buildSessionFactory();
       Session session=factory.openSession();
       Transaction txt=session.beginTransaction();
       session.save(e1);
       session.save(e2);
       session.save(e3);
       session.save(e4);
       session.save(e5);
       session.save(t1);
       session.save(t2);
       session.save(t3);
       session.save(t4);
       txt.commit();
       System.out.println("====>done");
       
	}

}
