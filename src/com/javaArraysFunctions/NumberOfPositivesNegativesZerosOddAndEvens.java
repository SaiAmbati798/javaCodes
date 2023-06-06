/*
 * program : Find number of positives,negatives,odds,evens and zeros in an array
 * @author Saikumar
 * 
 * @since 31/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaArraysFunctions;
import java.util.Scanner;
public class NumberOfPositivesNegativesZerosOddAndEvens {
	public static void main(String[] args) {
		int []arr1=new int[20];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			int dump=scan.nextInt();
			arr1[i]=dump;
		}
		int noofPositives=0;
		int noofNegatives=0;
		int noofOdds=0;
		int noofEvens=0;
		int noofZeros=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>0)noofPositives++;
			else if(arr1[i]<0)noofNegatives++;
			else noofZeros++;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0)noofEvens++;
			else noofOdds++;
		}
		System.out.println("No of Positives in the Array : "+noofPositives);
		System.out.println("No of Negatives in the Array : "+noofNegatives);
		System.out.println("No of Odds in the Array : "+noofOdds);
		System.out.println("No of Evens in the Array : "+noofEvens);
		System.out.println("No of Zeros in the Array : "+noofZeros);
	}
}
