package com.javaArraysFunctions;

import java.util.Scanner;

public class FindSumAverageProduct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int product=1;
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		int average=sum/arr.length;
		System.out.println(average);
		for(int i=0;i<arr.length;i++) {
			product=product*arr[i];
		}
		System.out.println(product);
		
		
	}

}
