package com.javaStrings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your ");
		String st1 = scan.nextLine();
		char[] ch1 = st1.toCharArray();
		String st2 = "";
		for (int i = ch1.length - 1; i >= 0; i--) {
			st2=st2+ch1[i];
		}
		if(st2.equalsIgnoreCase(st1))System.out.println("It is a palindrome");
		else System.out.println("Not a Palindrome" );
		
		System.out.println(Palindrome.isPalindrome(st1));
	}
	static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(i>j)return true;
			if(s.charAt(i++)!=s.charAt(j--))return false;
		}
		return true;
	}

}
