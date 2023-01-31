package com.jsp.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {
	@Value(value="x10")
	private String name;
	@Value(value="bmw")
	private String brand;
	
	public void Print() {
		System.out.println(name);
		System.out.println(brand);
	}

}
