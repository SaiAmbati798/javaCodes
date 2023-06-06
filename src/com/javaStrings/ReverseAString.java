package com.javaStrings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your ");
		String s1 = scan.nextLine();
		char[] c1 = s1.toCharArray();
		String s2 = "";
		for (int i = c1.length - 1; i >= 0; i--) {
			s2=s2+c1[i];
		}
		
//		for(int i=s1.length()-1;i >= 0;i--) {
//			
//			s2=s2 + s1.charAt(i);
//		}
		System.out.println(s2);
		scan.close();
		

	}

}
