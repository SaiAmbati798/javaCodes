/*
 * program ReadingInputFromUser
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaVariables;
import java.util.*;
public class ReadingInputFromUser {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Please enter the sample Inputs");
		String str1=sc.next();
		String str2=sc.next();
		System.out.println("Welcome "+str1+"! Welcome "+str2+" too!");
	}
}
