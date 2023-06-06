package com.javaStrings;

import java.util.Scanner;

public class getStringAndLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();

		System.out.println(str1.length());

		String str2 = scan.nextLine();
		System.out.println(str2.length());

		scan.close();
	}

}
