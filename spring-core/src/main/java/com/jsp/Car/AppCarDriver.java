package com.jsp.Car;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCarDriver {
	
	public static void main(String []args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Car car=(Car)applicationContext.getBean("mycar");
		car.printCarDetails();
	}

}
