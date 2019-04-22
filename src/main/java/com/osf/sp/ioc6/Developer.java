package com.osf.sp.ioc6;

public class Developer extends Worker {

	public Developer() {
		super("개발자", "IT팀");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		System.out.println("맨날 개발중");
	}

	@Override
	public void goToOffice() {
		System.out.println("개발하러 회사가는중 ");

	}

}
