package com.javaControlFlowStatements;

import java.util.Scanner;

public class IPLMatchesForAWeek {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String date=scan.next();
		switch(date) {
		case "20-05-2023":
			System.out.println("Ipl match between RCB and SRH");
			break;
		case "21-05-2023":
			System.out.println("Ipl match between CSK and MI");
			break;
		case "22-05-2023":
			System.out.println("Ipl match between KKR and PKGS");
			break;
		case "23-05-2023":
			System.out.println("Ipl match between DC and GT");
			break;
		case "24-05-2023":
			System.out.println("Ipl match between RR and LSG");
			break;
		case "25-05-2023":
			System.out.println("Ipl match between CSk and SRH");
			System.out.println("Ipl match between RCB and MI");
			break;
		case "26-05-2023":
			System.out.println("Ipl match between KKR and DC");
			System.out.println("Ipl match between GT and LSG");
			break;
		default:
			System.out.println("Invalid Date");
			break;
		}
			
		scan.close();
	}

}
