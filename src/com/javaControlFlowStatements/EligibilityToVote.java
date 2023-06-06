/*
 * program : Findout which is greater in the given numbers
 * @author Saikumar
 * 
 * @since 31/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.Scanner;

public class EligibilityToVote {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int age=scan.nextInt();
		if(age>=0){
			if(age>=18)System.out.println("Eligible to vote");
			else System.out.println((18-age) + " more years needed get eligibility");
			}
		else {
			System.out.println("please enter the valid age (not negative number)");
			}
		}
}
