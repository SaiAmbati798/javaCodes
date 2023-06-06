/*
 * program :  Pass and Fail
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.Scanner;

public class PassAndFail {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int marks=scan.nextInt();
		if(marks>50)System.out.println("PASS");
		else System.out.println("FAIL");
		scan.close();
	}

}
