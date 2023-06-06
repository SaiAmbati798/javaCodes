package com.javaControlFlowStatements;
import java.util.*;
public class FindPositiveNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		//int b=scan.nextInt();
		if(a>0)System.out.println(a + " is positive number");
		else if (a<0)System.out.println(a + " is negative number");
		else System.out.println(a + " is neither positive nor negative number ");
	}

}
