package com.Techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements IDao {

	@Override
	public void dataBaseName() {
		System.out.println("connecting to Oracle Database");

	}

}
