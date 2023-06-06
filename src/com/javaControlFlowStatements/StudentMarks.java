/*
 * program :  Student marks and grades 
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		if(n1>100) {
			System.out.println("Enter the valid Number");
		}
		else {
		if(n1>90)System.out.println("Student grade is O");
		else if(n1<=90 && n1>=81)System.out.println("Student grade is A ");
		else if(n1<=80 && n1>=71)System.out.println("Student grade is B ");
		else if(n1<=70 && n1>=61)System.out.println("Student grade is C ");
		else if(n1<=60 && n1>=50)System.out.println("Student grade is D ");
		else System.out.println("Student grade is F");
		}
	}

}
