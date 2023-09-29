package com.proyecto.ecoomerce.model;

public class User {
	private Integer id;
	private String name;
	private String username;
	private String email;
	private String direction;
	private String phoneNumber;
	private String type;
	private String password;

	public User() {

	}

	public User(Integer id, String name, String username, String email, String direction, String phoneNumber,
			String type, String password) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.direction = direction;
		this.phoneNumber = phoneNumber;
		this.type = type;
		this.password = password;

	}

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
