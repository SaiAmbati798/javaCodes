package com.javaStrings;

import java.util.Scanner;

public class ReplaceVowelsWithZ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your String ");
		String st1 = scan.nextLine();
		for(int i=0;i<=st1.length()-1;i++) {
			String c=""+st1.charAt(i);
			if(c.equals("a") || c.equals("e") ||c.equals("i")||c.equals("o") ||c.equals("u")) {
				st1=st1.replaceAll(c,"z");
			}
		}
		System.out.println(st1);
		

	}

}
