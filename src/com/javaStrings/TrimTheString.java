package com.javaStrings;

import java.util.Scanner;

public class TrimTheString {

	public static void main(String[] args) {
		String s= " Concentrate ";
		s=s.trim();
		System.out.println(s);
		System.out.println(s.startsWith("Con"));
		System.out.println(s.endsWith("ate"));
		String mail="saireddyambati642@gmail.com";
		if(mail.endsWith(".com"))System.out.println("Valid Mail Id");
		else System.out.println("Invalid Mail Id");
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		for(int i=0;i<test.length();i++) {
			
		}
		
	}

}
