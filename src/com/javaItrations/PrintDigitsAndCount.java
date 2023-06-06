package com.javaItrations;

import java.util.Scanner;

public class PrintDigitsAndCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int positive=0;
		int negative=0;
		int zero=0;
		char k;
		while(true) {
			String num=scan.next();
		
			if(num.equals("Y"))break;
			else {
				int num1=Integer.parseInt(num);
				if(num1>0)positive++;
				else if(num1<0)negative++;
				else zero++;
			}
		}
		System.out.println("Total Positives : "+positive);
		System.out.println("Total Negatives : "+negative);
		System.err.println("Total zeros : "+zero);
	}

}
