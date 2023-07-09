package com.springbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbackend.entity.Products;
import com.springbackend.entity.Registration;
import com.springbackend.repository.ProductsRepository;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsRepository productRepository;
	
	
	@PostMapping("/proup")
	public Products productUp(@RequestBody Products prodUp) {
		return productRepository.save(prodUp);
	}
	
	// get all employees
	@GetMapping("/products")
	public List<Products> getAllProducts(){
		return productRepository.findAll();
	}		

}
