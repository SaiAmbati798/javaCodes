/*
 * program : Print last two digits of the given number
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.Scanner;
public class LastTwoDigitsOfTheGivenNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		System.out.println(n1%100);
	}

}
