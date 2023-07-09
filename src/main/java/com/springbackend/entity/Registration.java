package com.springbackend.entity;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "registration")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
	
	@Column(name="phone")
	private Integer phone;
	
	@Lob
	private byte[] imgURLfile;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", 
	joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Collection<Role> roles;

	public Registration()
	{
		
	}
	
	


	
	public Registration(Integer id, String userName, String password, String firstName, String lastName, String email,
			Integer phone, byte[] imgURLfile, Collection<Role> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.imgURLfile = imgURLfile;
		this.roles = roles;
	}






	public Registration(String userName, String password, String firstName, String lastName, String email,
			Integer phone, byte[] imgURLfile, Collection<Role> roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.imgURLfile = imgURLfile;
		this.roles = roles;
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Integer getPhone() {
		return phone;
	}





	public void setPhone(Integer phone) {
		this.phone = phone;
	}





	public byte[] getImgURLfile() {
		return imgURLfile;
	}





	public void setImgURLfile(byte[] imgURLfile) {
		this.imgURLfile = imgURLfile;
	}





	public Collection<Role> getRoles() {
		return roles;
	}





	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}





	@Override
	public String toString() {
		return "Registration [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", imgURLfile="
				+ Arrays.toString(imgURLfile) + ", roles=" + roles + "]";
	}

	
	
	
	
	
}
