package com.learn.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping(value = "/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(

				new Course(1, "AWS", "JK"), 
				new Course(2, "Azure", "Jin"), 
				new Course(3, "DP-900", "SUGA")

		);
	}

}
