/*
 * program : Swapping two Numbers
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.*;
public class SwappingNumbers {

	public static void main(String[] args) {
		int a=9;
		int b=7;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+","+b);
		a=14;
		b=16;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+","+b);
		a=19;
		b=22;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+","+b);
		
		
		
				

	}

}
