/*
 * programr : Interest Calculator
 * @author Saikumar
 * 
 * @since 30/05/2023
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.Scanner;
public class InterestCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		int r=scan.nextInt();
		int n=scan.nextInt();
		System.out.println("Simple Interest :"+((p*r*n)/100));
		scan.close();

	}

}
