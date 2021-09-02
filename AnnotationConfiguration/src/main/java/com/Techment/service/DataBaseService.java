package com.Techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Techment.dao.Employee;
import com.Techment.dao.IDao;

//@Service("dbservice")
@Service
public class DataBaseService {

	@Autowired
	@Qualifier("mySql")
	IDao dao;
	
	@Autowired
	Employee employee;
	
	public void displayDatabaseInfo()
	{
		dao.dataBaseName();
		employee.displayEMployeeInfo();
	}
	
}
