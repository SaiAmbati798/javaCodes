/*
 * program :  Pass and Fail
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;
import java.util.Scanner;
public class LuckyNumberForRegistration {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num>999 && num<10000) {
			int sum=0;
			sum=num%10;
			num=num/10;
			sum=sum+num%10;
			num=num/10;
			sum=sum+num%10;
			num=num/10;
			sum=sum+num;
			if((sum%3==0) || (sum%5==0) || (sum%7==0)) {
				System.out.println("It is my Lucky Number");
			}
			else {
				System.out.println("It is not a Lucky Number");
			}	
		}else {
			System.out.println("Invalid number");
		}
		scan.close();
	}

}
