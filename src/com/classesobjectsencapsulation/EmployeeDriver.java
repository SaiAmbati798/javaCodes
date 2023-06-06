package com.classesobjectsencapsulation;
class Employee{
	String empId;
	String empName;
	String emailId;
	long phoNum;
	double salary;
	public void setEmployeeDetails() {
		empId="ES5950";
		empName="Sai Kumar Reddy";
		emailId="saireddyambati64@gmail.com";
		phoNum=7989321878l;
		salary=24000.0;	
	}
	public void getEmployeeDetails() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Email : "+emailId);
		System.out.println("Employee PhoneNumber : "+phoNum);
		System.out.println("Employee Salary : "+salary);
	}
	int factorial(int n) {
		if(n==1) return 1;
		return n*factorial(n-1);
	}
}
public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmployeeDetails();
		emp.getEmployeeDetails();
		System.out.println(emp.factorial(5));

	}

}
