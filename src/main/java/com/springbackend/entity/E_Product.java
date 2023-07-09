package com.springbackend.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="e_product")
public class E_Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name="name")
    private String name;
    
    @Column(name="company")
    private String company;
    
    @Column(name="price")
    private double price;
    
    @Column(name="image")
    @Lob
    private String image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

    
    
}
