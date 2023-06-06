/*
 * program : Arm Strong
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaItrations;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int t=n1;
		int t2=n1;
		int length = 0;
		int sum=0;
		while(t!=0) {
			t=t/10;
			length++;
		}
		while(n1!=0) {
			sum=sum+(int)Math.pow(n1%10,length);
			n1=n1/10;
		}
		if(sum==t2)System.out.println("Arm Strong Number");
		else System.out.println("Not Arm Strong Number");

	}

}
