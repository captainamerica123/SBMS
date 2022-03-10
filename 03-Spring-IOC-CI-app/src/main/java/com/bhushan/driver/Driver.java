package com.bhushan.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhushan.beans.Car;

public class Driver {
	public static void main(String args[])
	{
		ApplicationContext cntx=new ClassPathXmlApplicationContext("Beans.xml");
		Car car= cntx.getBean(Car.class);
		car.drive();
	}

}
