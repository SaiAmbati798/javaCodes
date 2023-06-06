/*
 * program :  Getting discount in shopping
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.Scanner;

public class ShoppingAmountAndDiscount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double totalAmount = scan.nextInt();
		if (totalAmount >= 5000) {
			System.out.println(totalAmount - (totalAmount * 25 / 100));
		} else if (totalAmount < 5000 && totalAmount >= 1000) {
			System.out.println(totalAmount - totalAmount * 10 / 100);
		} else {
			System.out.println(totalAmount - totalAmount * 5 / 100);
		}
	}
}
