
/*
 * program :Currency notes denominations
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.Scanner;

public class CurrencyNotesOfDenominations {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int res=n1/100;
		n1=n1-(res*100);
		
		int res1=n1/50;
		n1=n1-(res1*50);
		
		int res2=n1/10;
		
		System.out.println(res2+" "+res1+" "+res);

	}

}
