/*
 * programr : LED manufacturing on two days 
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.Scanner;
public class LEDManufacturingOnTwoDays {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int firstDay=scan.nextInt();
		int secondDay=scan.nextInt();
		System.out.println("Total bulbs manufactured :"+ (firstDay+secondDay) );
		scan.close();
	}
}
