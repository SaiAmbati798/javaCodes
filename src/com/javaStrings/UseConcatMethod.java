package com.javaStrings;

import java.util.Scanner;

public class UseConcatMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		String s3 = s1.concat(s2);
		System.out.println("\ns1 :"+s1+"\ns2 :"+s2+"\ns3 :"+s3);
 
	}

}
