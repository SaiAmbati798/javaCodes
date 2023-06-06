/*
 * program : Findout area of rectangle is greater than perimeter of rectangle
 * @author Saikumar
 * 
 * @since 31/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.Scanner;

public class AreaOfRectangleIsGreaterThanPerimeter {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int length=scan.nextInt();
		int breadth=scan.nextInt();
		if(length>0 && breadth>0) {
			if((length*breadth) > 2*(length+breadth)) System.out.println("Area of rectangle is greater than perimeter of rectangle ");
			else System.out.println("Area of rectangle is not greater than perimeter of rectangle ");
		}
		else {
			System.out.print("Please enter valid length and breadth");
		}

	}

}
