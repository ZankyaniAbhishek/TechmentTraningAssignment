package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICouseDao;
import com.techment.entity.Course;

@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	ICouseDao dao;

	@Override
	public List<Course> viewAllCourse() {
		
		return dao.findAll();
	}

	@Override
	public String saveCourse(Course course) {
		
		dao.save(course);
		return "Successfully Saved";
	}

	@Override
	public Course getCourseById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public String deleteCourseById(Integer id) {

		dao.deleteById(id);
		return "Delete Successfull";
		
	}

	

	

	

	
	
	
}
