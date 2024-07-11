package com.springswagger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springswagger.entity.Employee;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Operation(summary = "POST operation",description = "API will add employee and return employee")
	@PostMapping("/addEmployee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
		return ResponseEntity.ok(employee);
	}
	
	@Operation(summary = "GET operation",description = "API will  return employee")
	@GetMapping("/getEmployee")
	public ResponseEntity<?> getEmmployee(){
		return ResponseEntity.ok("employee...!");
	}
	
	@Operation(summary = "DELETE operation",description = "API will delete employee ")
	@DeleteMapping("/deleteEmployee")
	public ResponseEntity<?> deleteEmployee(){
		return ResponseEntity.ok("employee deleted..!");
	}
	
	@Operation(summary = "PATCH operation",description = "API will update employee ")
	@PatchMapping("/updateEmployee")
	public ResponseEntity<?> updateEmployee(){
		return ResponseEntity.ok("employee updated....!");
	}
		
}
