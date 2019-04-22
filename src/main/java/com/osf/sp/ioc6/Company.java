package com.osf.sp.ioc6;

public class Company {
	private Worker w1;
	private Worker w2;
	
	public Company(Worker w1, Worker w2) {
		this.w1 = w1;
		this.w2 = w2;
	}
	
	public void startOperate() {
		w1.goToOffice();
		w2.goToOffice();
	}
	public void operating() {
		w1.doWork();
		w2.doWork();
	}
}
