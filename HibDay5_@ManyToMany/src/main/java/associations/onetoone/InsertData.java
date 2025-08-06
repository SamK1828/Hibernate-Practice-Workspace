package associations.onetoone;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import associations.entity.Department;
import associations.entity.Employee;

/*
 One to many means one is having many relationships.....
 example is one department have many employees working under it...
 */
public class InsertData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department dept = new Department();
		dept.setDept_name("Java Development");

		Employee e1 = new Employee();
		e1.setEmp_id(1004);
		e1.setName("Samarth");
		e1.setDept(dept);
		e1.setSalary(200000);

		Employee e2 = new Employee();
		e2.setEmp_id(1005);
		e2.setName("Ranjay");
		e2.setDept(dept);
		e2.setSalary(300000);

		Employee e3 = new Employee();
		e3.setEmp_id(1006);
		e3.setName("Nilesh");
		e3.setDept(dept);
		e3.setSalary(400000);

		ArrayList employeeList = new ArrayList();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		ss.persist(dept);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		dept.setEmployeeList(employeeList);

		tr.commit();
		ss.close();

		System.out.println("Data is inserted...");

	}

}
