package com.jsp.Bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriver {
	public static void main(String []args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Bike bike=(Bike)applicationContext.getBean("mybike");
		bike.printBikeDetails();
	}

}
