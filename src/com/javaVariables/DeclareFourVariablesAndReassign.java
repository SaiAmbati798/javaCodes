/*
 * programs declaring 4 variables and reassigning
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaVariables;

import java.util.*;

public class DeclareFourVariablesAndReassign {
	public static void main(String[] args) {
		int number1 = 100;
		int number2 = 200;
		int number3 = 300;
		int number4 = 1000;
		System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);
		number4 = number3;
		number3 = number2;
		number2 = number1;
		number1 = 100;
		System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);
	}
}
