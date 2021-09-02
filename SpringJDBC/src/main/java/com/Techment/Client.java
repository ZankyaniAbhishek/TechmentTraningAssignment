package com.Techment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Client {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("object.xml");
		BeanFactory factory =new XmlBeanFactory(resource);
	
		MySqlDemo demo = (MySqlDemo)factory.getBean("mysql");
		demo.insertDate();
		
		
		
		
	}
}
