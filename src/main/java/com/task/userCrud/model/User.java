package com.task.userCrud.model;

import java.time.LocalDateTime;

public class User {
	
	private int id;
	private String name;
	private String email;
	private int age;
	private String city;
	private long mobile;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public User() {
		super();
	}
	
	
	
}





//CREATE TABLE `user_dashboard`.`user` (
//		  `id` INT NOT NULL,
//		  `name` VARCHAR(45) NOT NULL,
//		  `email` VARCHAR(45) NOT NULL,
//		  `age` INT NOT NULL,
//		  `city` VARCHAR(45) NOT NULL,
//		  `mobile` VARCHAR(45) NOT NULL,
//		  `created_time` timestamp NOT NULL,
//		  `updated_time` timestamp NOT NULL,
//		  PRIMARY KEY (`id`));
