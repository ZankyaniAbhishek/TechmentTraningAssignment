package com.Techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySql implements IDao {

	@Override
	public void dataBaseName() {
		System.out.println("Connectiog to My Sql Database");

	}

}
