/*
 * program :circumferenceOfCircle
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.*;
public class CircumferenceOfCircle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int diameter=scan.nextInt();
		System.out.println((int)(3.14*diameter));
		scan.close();
	}
}
