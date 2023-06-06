/*
 * program : Find the eligibility of blood donors
 * @author Saikumar
 * 
 * @since 31/05/2023
 * 
 * @version jdk11
 * 
 * */

package com.javaArraysFunctions;

import java.util.Scanner;

class BloodDonor{
	static void isEligibility(int age,double weigth) {
		if((age>18 && age<=55) && weigth>45 )System.out.println("Eligible To donate blood");
		else System.out.println("Not Eligible To donate blood");
	}
}
public class BloodDonorsEligibilityDriver {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		double weigth=scan.nextDouble();
		BloodDonor.isEligibility(age, weigth);
		
	}

}
