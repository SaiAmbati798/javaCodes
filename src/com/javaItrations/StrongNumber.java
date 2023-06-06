/*
 * program : Strong Number
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaItrations;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		int t=num;
		for(int i=1;i<=t/2;i++) {
			if(t%i==0) sum=sum+i;
		}
		if(sum==num)System.out.println("Perfect number");
		else System.out.println("Not a Perfect number");
		

	}

}
