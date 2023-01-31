package com.jsp.Bike;

public class Bike {
	
	private String name;
	private String brand;
	
	
	public Bike(String name,String brand) {
		this.brand=brand;
		this.name=name;
	}
	public void printBikeDetails() {
		System.out.println("========Bike=========");
		System.out.println(name);
		System.out.println(brand);
	}

}
