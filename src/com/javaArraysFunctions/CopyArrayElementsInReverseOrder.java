
/*
 * program : Copying elements from one array to another array in reverse order
 * @author Saikumar
 * 
 * @since 31/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaArraysFunctions;
import java.util.*;
class CopyArrayElementsInReverseOrder {

	public static void main(String[] args) {
		int []arr1=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			int dump=scan.nextInt();
			arr1[i]=dump;
		}
		for(int k:arr1) {
		System.out.print(k+" ");
		}
		System.out.println();
		int copyArray[]=new int[10];
		int i=0;
		int j=arr1.length-1;
		while(i<copyArray.length) {
			copyArray[i]=arr1[j];
			i++;
			j--;
		}
		for(int k:copyArray) {
			System.out.print(k+" ");
		}

	}

}
