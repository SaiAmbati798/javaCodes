package com.javaItrations;

import java.util.Scanner;

public class FactorsOfTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i=1;
		while(i<=num/2) {
			if(num%i==0)System.out.print(i+ " ");
			i++;
		}

	}

}
