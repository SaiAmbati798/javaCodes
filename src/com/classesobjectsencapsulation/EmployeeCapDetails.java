package com.classesobjectsencapsulation;
class Employed{
	private String empId;
	private String empName;
	private String empMail;
	private long phoneNumber;
	private double salary;
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpId() {
		return empId;
	}
	public Employed(String empId, String empName, String empMail, long phoneNumber, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	
	
}
public class EmployeeCapDetails {

	public static void main(String[] args) {
		//Employed ec1=new Employed();
	}

}
