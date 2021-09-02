package com.Techment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MySqlDemo {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	void insertDate()
	{
		jdbcTemplate.execute("insert into employee values(200,'santosh',56000)");
		System.out.println("Data Inserted Properly");
	}
	

}
