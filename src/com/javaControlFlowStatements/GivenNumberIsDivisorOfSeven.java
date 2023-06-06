
package com.javaControlFlowStatements;

import java.util.Scanner;

public class GivenNumberIsDivisorOfSeven {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n1=scan.nextInt();
		if((n1%7==0) && (n1>0))System.out.println(n1+" is divisor of 7");
		else System.out.println(n1+" is not a divisor of 7");

	}

}
