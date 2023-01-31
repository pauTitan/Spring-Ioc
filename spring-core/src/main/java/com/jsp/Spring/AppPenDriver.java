package com.jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPenDriver {
	
	public static void main(String []args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Pen pen=(Pen)applicationContext.getBean("mypen");
		pen.Drink();
	}

}
