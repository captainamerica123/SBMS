package com.bhushan.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String args[])
	{
		/*ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Payment payment=context.getBean(Payment.class);
		payment.PaymentMethod(2000);*/
		
		/*Resource resource=new ClassPathResource("Beans.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Payment payment=factory.getBean(Payment.class);*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Payment payment1=context.getBean(Payment.class);
		System.out.println(payment1.hashCode());
		
		Payment payment2=context.getBean(Payment.class);
		System.out.println(payment2.hashCode());
	}

}
