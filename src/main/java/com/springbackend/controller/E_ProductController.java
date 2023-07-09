package com.springbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbackend.entity.E_Product;
import com.springbackend.entity.Registration;
import com.springbackend.repository.E_ProductRepository;


@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")

@RestController
public class E_ProductController {
	
	
			@Autowired
			private E_ProductRepository eProRepo;
	
			// get all product
			@GetMapping("/e_product")
			public List<E_Product> getAllProduct(){
				return eProRepo.findAll();
			}

}
