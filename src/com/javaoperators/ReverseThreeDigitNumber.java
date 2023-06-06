/*
 * program :  Reversing the three digt number 
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.*;
public class ReverseThreeDigitNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int res=(n1%10)*100;
		n1=n1/10;
		res=res+ (n1%10)*10;
		n1=n1/10;
		res=res+n1;
		System.out.println(res);
	}
}
