package com.javaItrations;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int rev;
		for( rev = 0;num>0;num/=10) {
			rev=rev*10 + num%10;
		}
		System.out.println(rev);
		scan.close();
	}

}
