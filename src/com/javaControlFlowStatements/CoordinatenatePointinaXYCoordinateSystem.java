package com.javaControlFlowStatements;

import java.util.Scanner;

class CoordinatenatePointinaXYCoordinateSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		if(x==0 && y==0) System.out.println("The point in origin ");
		else if(x==0 && y>0)System.out.println("The point in positive Y-axis");
		else if(x==0 && y<0)System.out.println("The point in negative Y-axis");
		else if(x>0 && y==0)System.out.println("The point in positive X-axis");
		else if(x<0 && y==0)System.out.println("The point in negative X-axis");
		else if(x>0 && y>0)System.out.println("The point in Quaderant 1");
		else if(x>0 && y<0)System.out.println("The point in Quaderant 2");
		else if(x<0 && y<0)System.out.println("The point in Quaderant 3");
		else System.out.println("The point in Quaderant 4");

	}

}
