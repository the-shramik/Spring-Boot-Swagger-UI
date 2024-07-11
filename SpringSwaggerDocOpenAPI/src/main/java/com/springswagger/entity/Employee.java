package com.springswagger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Long empId;
	private String empName;
	private String empEmail;
	
}
