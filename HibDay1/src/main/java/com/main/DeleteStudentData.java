package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class DeleteStudentData {
	public static void main(String[] args) {
		// Configuration + Entity Class
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);

		// Session Creation
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction txn = session.beginTransaction();
		int student_id=1;
		Student tempStudent= session.get(Student.class,student_id );
//		Student tempStudent= session.load(Student.class,student_id );
		
//		System.out.println(tempStudent);
//		session.delete(tempStudent); // Deprecated Method
		session.remove(tempStudent);
		System.out.println("Data is Deleted....");
		
		txn.commit();
		session.close();
	}
}
