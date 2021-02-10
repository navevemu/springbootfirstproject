package com.example.demo.model;

import java.util.Date;

import lombok.Data;

@Data
public class Student {
	
	private String name;
	private long rollNo;
	private Date dateOfJoin;
	public static final String collegeName="Narayana Enggneering College";
	

}
