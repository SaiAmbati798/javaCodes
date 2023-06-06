package com.classesobjectsencapsulation;
class Employer{
	String empId;
	String empName;
	String emailId;
	long phoNum;
	double salary;
	// default constructor
	public Employer() {
		empId="ES5950";
		empName="Sai Kumar Reddy";
		emailId="saireddyambati64@gmail.com";
		phoNum=7989321878l;
		salary=24000.0;	
	}
	// parameterized constructor with three arguments
	public Employer(String id,String name,String mail) {
		empId=id;
		empName=name;
		emailId=mail;
	}
	// parameterised constructor with all arugments
	public Employer(String empId, String empName, String emailId, long phoNum, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.phoNum = phoNum;
		this.salary = salary;
	}
//	public void setEmployeeDetails(String id,String name,String mail,long pho,double sal) {
//		empId=id;
//		empName=name;
//		emailId=mail;
//		phoNum=pho;
//		salary=sal;	
//	}
	public void getEmployeeDetails() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Email : "+emailId);
		System.out.println("Employee PhoneNumber : "+phoNum);
		System.out.println("Employee Salary : "+salary);
	}
}
public class EmployeeConstructor {

	public static void main(String[] args) {
		//object for default constructor
		Employer e1=new Employer();
		e1.getEmployeeDetails();
		//object for three parameterised constructor
		Employer e2=new Employer("ES7890","Krishna","Kirshnareddy789@gmail.com");
		e2.getEmployeeDetails();
		//object for parameterised constructor
		Employer e3=new Employer("ES7890","Krishna","Kirshnareddy789@gmail.com",9959350323l,70000.00);
		e3.getEmployeeDetails();
	}

}
