package com.javaStrings;

import java.util.Scanner;

public class AcceptsTwoStringAndPerform {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your String ");
		String st1 = scan.nextLine();
		String st2 = scan.nextLine();
		char[] c1 = st2.toCharArray();
		String s2 = "";
		for (int i = c1.length - 1; i >= 0; i--) {
			s2=s2+c1[i];
		}
		st2=s2;
		st1=st1+st2;
		System.out.println(st1);

	}

}
