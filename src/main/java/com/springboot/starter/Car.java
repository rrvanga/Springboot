package com.springboot.starter;

public class Car {

	private Integer id;
	private String name;
	private String Manufacturer;
	
	
	public Car() {
		
	}
	
	public Car(Integer id, String name, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		Manufacturer = manufacturer;
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
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	
	
	
}
