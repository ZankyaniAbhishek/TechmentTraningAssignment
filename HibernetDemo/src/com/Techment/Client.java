package com.Techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//Project NAme HybernetDemo
public class Client {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Abhishek");
		employee.setDept("hr");
		session.persist(employee);
		System.out.println("Inserted");
		tx.commit();
		session.close();

	}

}
