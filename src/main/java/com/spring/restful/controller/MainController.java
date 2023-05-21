package com.spring.restful.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.model.Student;


//localhost 9090 /restful
@RestController
@RequestMapping("/main")
//localhost 9090 /restful/main
public class MainController {

	//localhost 9090 /restful/main/facebook
	@GetMapping("/facebook")
	public String gerMain() {
		return "Hi Gemy";
	}
	
	//localhost8080/restful/main/students
	@GetMapping("/students")
	public List<Student> getStudents(){
	
		Student s1 = new Student(1,"Ahmed","01025446634");
		Student s2 = new Student(2,"Mohamed","0100000000");
		Student s3 = new Student(3,"Gemy","01025446484");
		Student s4 = new Student(4,"Shaaban","01025416634");
		Student s5 = new Student(5,"Mostafa","01025464634");
	
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		return students ; 
		
		
		
		
	}  
	
}
