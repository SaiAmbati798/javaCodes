package com.javaArraysFunctions;

import java.util.Scanner;
class AgeChecking{
	static boolean isEligible(int age) {
		if(age<18)return false;
		return true;
	}
}
public class VotingFunction {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age");
		int age=scan.nextInt();
		if(AgeChecking.isEligible(age))System.out.println("Is Eligible to vote");
		else System.out.println("Not Eligible to vote");
	}

}
