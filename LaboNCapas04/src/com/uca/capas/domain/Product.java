package com.uca.capas.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {
	static final String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
	static final String max30 = "Este campo debe ser maximo de 30 caracteres";
	
	@Size(message = max30, max = 30)
	@NotNull(message = "El nombre no puede estar vacio")
	private String name;
	
	@Size(message = max30 ,max = 30)
	@NotNull(message = "La marca no puede estar vacia")
	private String brand;
	
	@Size(message = max30, max = 30)
	@NotNull(message = "La descripcion no puede estar vacia")
	private String description;
	
	@Size(message = max30, max = 30)
	@NotNull(message = "La categoria no puede estar vacia")
	private String category;
	
	@PositiveOrZero(message = "El precio debe ser positivo")
	@NotNull(message = "El precio no puede estar vacio")
	private double price;
	
	@Pattern(message = "La fecha debe cumplir el formato dia/mes/año", regexp = regex)
	@NotNull(message = "La fecha de expiracion no puede estar vacia")
	private String exp_date;
	
	
	public Product(String name, String brand, String description, String category, double price, String exp_date) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.category = category;
		this.price = price;
		this.exp_date = exp_date;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}