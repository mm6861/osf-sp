package com.osf.sp.ioc3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Excute {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc3/ioc.xml");
		Person p = (Person)ac.getBean("p");
		System.out.println(p);
		// Excute 는  Person 에 대해 의존성을 가지고 있다. 
	}
}
