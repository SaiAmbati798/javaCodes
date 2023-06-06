/*
 * program :Add 8 to given number and then divide it by 3. modulus it with
 * 5 amd then mutiply it with 5
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.*;
public class Add8ToTheGivenNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		System.out.println((((n1+8)/3)%5)*5);
		scan.close();
	}

}
