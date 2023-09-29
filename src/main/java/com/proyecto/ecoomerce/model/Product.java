package com.proyecto.ecoomerce.model;

public class Product {
	
	private Integer id;
	private String description;
	private String name;
	private String image;
	private double price;
	private int quantity;

	public Product(Integer id,String description, String name, String image, double price, int quantity){
		this.id = id;
		this.description = description;
		this.name = name;
		this.image = image;
		this.price = price;
		this.quantity = quantity;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", description=" + description + ", name=" + name + ", image=" + image
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
