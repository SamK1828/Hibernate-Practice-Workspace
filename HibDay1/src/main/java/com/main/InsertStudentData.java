package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class InsertStudentData {
	public static void main(String[] args) {
		// Configuration + Entity Class
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);

		// Session Creation
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction txn = session.beginTransaction();

		// Entity Insertion with Values
		Student student = new Student();
		student.setsName("Ranjay");
		student.setCity("Pune");
		student.setAge(22);
		student.setCollegeName("CSMSS CSCOE");

//		session.save(student); // Deprecated Function
		session.persist(student);
		session.close();
		System.out.println("Data Inserted");

	}
}
