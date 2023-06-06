/*
 * program : Assign values of variable 'a' and 'b' as 55 and 70
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;

public class AssigningValuesCheskingBooleanConditions {
	public static void main(String [] args) {
		int a = 55;
		int b = 70;
		System.out.println(a<50 && a<b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println(a<50 || a>b);
	}
}
