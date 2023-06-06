package com.javaItrations;

import java.util.Scanner;

public class SumOfOddAndEvenInRange {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sumOfOdd=0;
		int sumOfEven=0;
		for(int i=0;i<=num;i++) {
			if(i%2!=0)sumOfOdd=sumOfOdd+i;
		}
		System.out.println(sumOfOdd);
		for(int i=0;i<=num;i++) {
			if(i%2==0) sumOfEven=sumOfEven+i;
		}
		System.out.println(sumOfEven);
		scan.close();
	}
	

}
