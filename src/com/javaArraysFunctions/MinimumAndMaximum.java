package com.javaArraysFunctions;

import java.util.Scanner;

public class MinimumAndMaximum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println();
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int minimum=arr[0];
		int maximum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(minimum>arr[i]) minimum=arr[i];
			if(maximum<arr[i]) maximum=arr[i];	
		}
		System.out.println("Maximum : " + maximum);
		System.out.println("Minimum : "+minimum);

	}

}
