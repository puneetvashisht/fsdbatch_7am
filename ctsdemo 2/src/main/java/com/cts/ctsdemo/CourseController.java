package com.cts.ctsdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	CourseRepo repo;
	
	@RequestMapping(path="/courses", method=RequestMethod.GET)
	public List<Course> findCourses(){
		List<Course> courses = repo.findAll();
		System.out.println(courses);
		return courses;
	}
	
	
	@RequestMapping(path="/courses", method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course){
		repo.save(course);
	}

}
