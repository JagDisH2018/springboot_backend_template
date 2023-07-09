package com.springbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="pro_Category")
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="catName")
	private String name;

}
