package com.springbackend.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbackend.entity.Student;
import com.springbackend.exception.StudentNotFoundException;
import com.springbackend.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {

	@Autowired
	private StudentRepository employeeRepository;
	
	// get all employees
	@GetMapping("/students")
	public List<Student> getAllEmployees(){
		return employeeRepository.findAll();
	}		
	
	// create employee rest api
	@PostMapping("/students")
	public Student createEmployee(@RequestBody Student employee) {
		return employeeRepository.save(employee);
	}
	
	// get employee by id rest api
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getEmployeeById(@PathVariable Long id) {
		Student employee = employeeRepository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}
	
	
	// update employee rest api
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateEmployee(@PathVariable Long id, @RequestBody Student employeeDetails){
		Student employee = employeeRepository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Employee not exist with id :" + id));
		
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		
		Student updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}
	
	// delete employee rest api
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Student employee = employeeRepository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Employee not exist with id :" + id));
		
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
