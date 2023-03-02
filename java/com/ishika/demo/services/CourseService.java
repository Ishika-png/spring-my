package com.ishika.demo.services;

import java.util.List;

import com.ishika.demo.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long CourseId);
	
	public Course addCourse(Course course);

}
