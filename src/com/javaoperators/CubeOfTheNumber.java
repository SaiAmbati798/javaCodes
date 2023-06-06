/*
 * program Cube of the given Number
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.*;
public class CubeOfTheNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k = scan.nextInt();
		//int cube=k*k*k;
		int cube= (int)Math.pow(k,3);
		System.out.println(cube);
		scan.close();
	}

}
