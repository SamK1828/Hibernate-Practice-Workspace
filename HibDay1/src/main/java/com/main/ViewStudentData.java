package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.entity.Student;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class ViewStudentData {
	public static void main(String[] args) {
		// Configuration + Entity Class
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);

		// Session Creation
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction txn = session.beginTransaction();
		
//		CriteriaBuilder to fetch the details
		CriteriaBuilder hcb=session.getCriteriaBuilder();	
		CriteriaQuery<Object> cQuery= hcb.createQuery();
		Root<Student> root= cQuery.from(Student.class);
		cQuery.select(root);
		
		Query query= session.createQuery(cQuery);
		List<Student> studentData=query.getResultList();
		
		for(Student student:studentData) {
			System.out.println(student);
		}
		
		
		
		
		
		
	}
}
