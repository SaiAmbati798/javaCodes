package com.javaArraysFunctions;

import java.util.Scanner;

public class StoreInputsInArrayAndFollowTheConditions {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[25];
		int i=0;
		int dum=0;
		while(true){
			dum=scan.nextInt();
			if(dum<0)break;
			else {
				arr[i]=dum;
				i++;
				}
		}
		System.out.println(i);
		int []arr2=new int[i];
		for(int j=0;j<i;j++) {
			arr2[j]=arr[j];
		}
		for(int k:arr2) {
			System.out.print(k+" ");
			
		}
		System.out.println();
		int []arr3=new int[i];
		for(int a=0;a<arr2.length;a++) {
			if(arr2[a]%2==0) {
				if(arr2[a]%8==0) {
					arr3[a]=2;
				}
				else if(arr2[a]%9==0) {
					arr3[a]=4;
				}
				else {
					arr3[a]=0;
				}
			}
			else {
				if(arr2[a]%10==1) {
					arr3[a]=3;
				}
				else if(arr2[a]%9==0) {
					arr3[a]=4;
				}
				else {
					arr3[a]=1;
				}
			}
		}
		for(int num : arr3) {
			System.out.print(num+" ");
		}
		scan.close();
		
	}

}
