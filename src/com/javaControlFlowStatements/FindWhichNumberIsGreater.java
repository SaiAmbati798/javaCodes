/*
 * program : Findout which is greater in the given numbers
 * @author Saikumar
 * 
 * @since 31/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.*;

public class FindWhichNumberIsGreater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if ((a > 0 && b > 0)|| (a!=0)){
			if (a > b)System.out.println(a + " is greater number than " + b);
			else System.out.println(b + " is greater number " + a);
		} else System.out.println("Please enter the values greater than zero and both numbers should not be same");
	}

}
