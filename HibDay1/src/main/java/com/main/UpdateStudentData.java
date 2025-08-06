package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class UpdateStudentData {
	public static void main(String[] args) {
		// Configuration + Entity Class
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);

		// Session Creation
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction txn = session.beginTransaction();
		
		int id = 4;
		
		Student student = session.get(Student.class, id);
		student.setsName("Samarth Kalegaonkar");
		student.setAge(24);
		
//		session.update(student); //Deprecated Method
		
		session.merge(student);
		txn.commit();
		session.close();
		System.out.println("Data Updated...");
		
	}
}
