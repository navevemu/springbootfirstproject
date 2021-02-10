package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Random;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;



@RestController
public class HelloWebService {
	
	public static ArrayList<Student> listofStudents=new ArrayList();
	
	@GetMapping("/hello")
	public String getGreetingMsg() {
		return "Hi Hello";
	}
	
	@GetMapping("/student")
	public ResponseEntity<ArrayList<Student>> getStudentDetails(){
		
		return new ResponseEntity<ArrayList<Student>>(listofStudents,HttpStatus.OK);
		
	}
	
	@PostMapping("/student")
	public ResponseEntity createStudent(@RequestBody Student std) {
		std.setRollNo(new Random().nextLong());
		listofStudents.add(std);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}

}
