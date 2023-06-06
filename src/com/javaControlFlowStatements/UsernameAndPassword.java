package com.javaControlFlowStatements;

import java.util.Scanner;

public class UsernameAndPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName="SaiKumar";
		String password="Sai@9876";
		System.out.print("Enter UserName : ");
		String uName=scan.next();
		System.out.print("Enter Password : ");
		String pass=scan.next();
		if(userName.equals(uName) && password.equals(pass)) System.out.println("Welcome "+userName);
		else System.out.println("Invalid Credentials");

	}

}
