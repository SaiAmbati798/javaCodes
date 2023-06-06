/*
 * program :  Groupmember and Groupleader 
 * @author Saikumar
 * 
 * @since 30/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.javaControlFlowStatements;

import java.util.Scanner;

public class GroupMemberAndGroupLeader {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ticketNumber=scan.nextInt();
		if(ticketNumber%10==0) {
			System.out.println("Group Leader");
		}
		else {
			System.out.println("Group Member");
		}
		

	}

}
