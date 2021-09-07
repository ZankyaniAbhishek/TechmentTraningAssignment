package com.techment.service;

import java.util.List;

import com.techment.entity.Course;

public interface ICourseService {

	public List<Course> viewAllCourse();
	public String saveCourse(Course course);
	public Course getCourseById(int id);
	public String deleteCourseById(Integer id);
}
