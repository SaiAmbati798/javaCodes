/*
 * program : Teacher Kept A Record Of Students Like.
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaoperators;
import java.util.Scanner;
public class TeacherKeptARecordOfStudentsLike {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int girlsLikeOrages=scan.nextInt();
		int girlsLikeMangos=scan.nextInt();
		int boysLikeOrages=scan.nextInt();
		int boysLikeMangos=scan.nextInt();
		System.out.println("Students likes Oranges : "+(girlsLikeOrages+boysLikeOrages));
		System.out.println("Students likes Manges : "+(girlsLikeMangos+boysLikeMangos));
		System.out.println("Total Students "+(girlsLikeOrages+boysLikeOrages+girlsLikeMangos+boysLikeMangos));
		System.out.println((girlsLikeOrages+girlsLikeMangos)>(boysLikeOrages+boysLikeMangos));
	}

}
