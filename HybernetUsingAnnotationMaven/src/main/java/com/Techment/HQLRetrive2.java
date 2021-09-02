package com.Techment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLRetrive2 {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Query<Student> query = session.createQuery("select s.studentId,s.name from Student s");
		List<Student> st = query.list();
		
		System.out.println(st.size());
		//System.out.println(st.get(1).getName());
		
//		for(StudentDto s :st)
//		{
//			StudentDto stu =(StudentDto)s;
//			System.out.println(stu.getStudentId() + " " +stu.getName() );
//		}
		
	}

}
