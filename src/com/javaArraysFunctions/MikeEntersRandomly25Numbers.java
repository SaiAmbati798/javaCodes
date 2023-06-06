package com.javaArraysFunctions;

import java.util.Scanner;

public class MikeEntersRandomly25Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter array size");
		int n=scan.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number");
		int getElement=scan.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(getElement==arr[i])count++;
		}
		System.out.println(count);
		scan.close();
	}

}
