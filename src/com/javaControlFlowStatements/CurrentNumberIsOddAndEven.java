/*
 * program :  CurrentNumber is odd and even
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.Scanner;

public class CurrentNumberIsOddAndEven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int currentNumber=scan.nextInt();
		if(currentNumber%2==0) {
			System.out.println(currentNumber/2);
		}
		else {
			System.out.println(currentNumber*3+1);
		}
		scan.close();
	}

}
