package inheritance1;

import inheritance.Emp;

public class WageEmp extends Emp {
	
	private int dailyWages;
	private int noOfDays;
	
	
	public WageEmp(int empId, String empName, double empSal, int dailyWages, int noOfDays) {
		super(empId, empName, empSal);
		this.dailyWages = dailyWages;
		this.noOfDays = noOfDays;
	}
	public int getDailyWages() {
		return dailyWages;
	}
	public void setDailyWages(int dailyWages) {
		this.dailyWages = dailyWages;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	@Override
	public String toString() {
		return "WageEmp ["+super.toString()+", dailyWages=" + dailyWages + ", noOfDays=" + noOfDays 
				+ "]";
	}
	
	

}
