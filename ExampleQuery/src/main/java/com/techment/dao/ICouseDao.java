package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Course;

public interface ICouseDao extends JpaRepository<Course, Integer>{

	
}
