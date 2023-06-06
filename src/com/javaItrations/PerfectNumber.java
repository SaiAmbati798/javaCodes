/*
 * program :Perfect Number
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaItrations;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n1/2;i++) {
			if(n1%i==0)sum=sum+i;
		}
		System.out.println(sum);

	}

}
