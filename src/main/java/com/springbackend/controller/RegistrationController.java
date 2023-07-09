package com.springbackend.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbackend.entity.Registration;
import com.springbackend.repository.RegistrationRepo;


@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")

@RestController()
public class RegistrationController {
	
	@Autowired
	private RegistrationRepo uRepo;
	
	
	
	@PostMapping("/registration")
	public Registration createEmployee(@RequestBody Registration reg) {
		return uRepo.save(reg);
	}
	
		// get all user
		@GetMapping("/regis")
		public List<Registration> getAllUser(){
			return uRepo.findAll();
		}
	
	
	
	

}
