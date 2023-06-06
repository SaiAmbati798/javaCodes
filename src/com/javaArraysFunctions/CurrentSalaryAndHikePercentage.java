package com.javaArraysFunctions;

import java.util.Scanner;

class Hike{
	static  int gettingSalary(int sal,int hike){
		return sal + sal*hike/100;
	}
}
public class CurrentSalaryAndHikePercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sal = scan.nextInt();
		int hike = scan.nextInt();
		System.out.println("Actual Salary : " + sal);
		System.out.println("Hike percentage : " + hike + "%");
		System.out.println("Getting Salary : " + Hike.gettingSalary(sal, hike));
		scan.close();
	}

}
