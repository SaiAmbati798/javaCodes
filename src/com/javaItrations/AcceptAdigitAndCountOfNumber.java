package com.javaItrations;

import java.util.Scanner;

public class AcceptAdigitAndCountOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		scan.close();

	}

}
