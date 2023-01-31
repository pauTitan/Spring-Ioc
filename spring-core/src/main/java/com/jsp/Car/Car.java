package com.jsp.Car;

public class Car {
	private String brand;
	private String name;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printCarDetails() {
		System.out.println("==========Car===========");
		System.out.println(name);
		System.out.println(brand);
	}
	

}
