/*
 * program Perimeter of Rectangle
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.*;
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Length=scan.nextInt();
		int Breadth=scan.nextInt();
		int perimeter=2*(Length + Breadth);
		System.out.println(perimeter);
		scan.close();
	}

}
