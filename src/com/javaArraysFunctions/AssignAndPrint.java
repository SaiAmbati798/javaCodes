package com.javaArraysFunctions;

public class AssignAndPrint {

	public static void main(String[] args) {
		int []a= {43,60,12,23,54,98,01};
		int sum=0;
		for(int i: a) {
			if(i%2!=0)System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		int average=sum/a.length;
		System.out.println(average);
		for(int i:a) {
			if(i>average)System.out.print(i+" ");
		}
			
	}

}
