/*
 * program Buying apples and bananas in market and depositing money in magic machine
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */package com.javaoperators;
import java.util.Scanner;
public class ApplesBanana {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int pocketMoney=sc.nextInt();
		int appleCost=sc.nextInt();
		int bananaCost=sc.nextInt();
		int spendAmount=appleCost+bananaCost;
		System.out.println("Total money spent in market : "+(appleCost+bananaCost) );
		System.out.println("Final amount when they reach home : "+((pocketMoney-spendAmount)*3));
		System.out.println("Money deposited in majic money :"+(pocketMoney-spendAmount));
	}
}
