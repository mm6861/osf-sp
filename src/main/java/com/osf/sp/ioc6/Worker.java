package com.osf.sp.ioc6;

public abstract class Worker implements Work {

	protected String workerName;
	protected String deparName;
	public Worker(String workerName, String deparName) {
		this.deparName= deparName;
		this.workerName=workerName;
	}

}
