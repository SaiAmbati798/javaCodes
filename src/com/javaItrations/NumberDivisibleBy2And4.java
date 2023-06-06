package com.javaItrations;

import java.util.Scanner;

public class NumberDivisibleBy2And4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 && i % 4 == 0 && i % 5 == 0)
				System.out.print(i + " ");
		}
		scan.close();
	}

}
