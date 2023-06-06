package com.classesobjectsencapsulation;
import java.util.*;
class Employees{
	String empId;
	String empName;
	String emailId;
	long phoNum;
	double salary;
	public void setEmployeeDetails(String id,String name,String mail,long pho,double sal) {
		empId=id;
		empName=name;
		emailId=mail;
		phoNum=pho;
		salary=sal;	
	}
	public void getEmployeeDetails() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Email : "+emailId);
		System.out.println("Employee PhoneNumber : "+phoNum);
		System.out.println("Employee Salary : "+salary);
	}
}
public class EmployeeDriverClassWithInputUser {

	public static void main(String[] args) {
		String id,name,mail;
		long pho;
		double sal;
		Scanner scan=new Scanner(System.in);
		Employees emp1 = new Employees();
		
		System.out.print("Employee id : ");
		id=scan.next();
		System.out.print("\nEmployee Name : ");
		name=scan.next();
		System.out.print("\nEmployee Mail : ");
		mail=scan.next();
		System.out.print("\nEmployee Phone number : ");
		pho=scan.nextLong();
		System.out.print("\nEmployee Salary : ");
		sal=scan.nextDouble();
		emp1.setEmployeeDetails(id, name, mail, pho, sal);
		emp1.getEmployeeDetails();
		Employees emp2=new Employees();
		emp2.setEmployeeDetails("ES6960","PavanKumar","pavankumarreddy697@gmail.com",9959350323l,35000);
		emp2.getEmployeeDetails();
	}

}
