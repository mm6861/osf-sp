package com.osf.sp.ioc5;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("고양이가 먹는다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("고양이가 잔다. ");
		
	}

}
