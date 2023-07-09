package com.springbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name="pName")
	private String productName;
	
	@Column(name="categoryId")
    private String categoryId;
	
	@Column(name="description")
    private String description;
	
	@Lob
    private byte[] imageUpload;
	
	@Column(name="price")
    private double price;
	
	@Column(name="quantity")
	private long quantity;
	
	@Column(name="weight")
	private long weight;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public byte[] getImageUpload() {
		return imageUpload;
	}

	public void setImageUpload(byte[] imageUpload) {
		this.imageUpload = imageUpload;
	}
	
	
    
	
}