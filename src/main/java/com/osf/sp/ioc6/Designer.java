package com.osf.sp.ioc6;

public class Designer extends Worker {

	public Designer() {
		super("디자이너", "IT팀");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		System.out.println("디자인중");

	}

	@Override
	public void goToOffice() {
		System.out.println("디자이너출근하신다.");

	}

}
