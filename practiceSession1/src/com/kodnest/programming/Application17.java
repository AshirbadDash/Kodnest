package com.kodnest.programming;

import java.util.Scanner;

public class Application17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user please enter the value of sidelengthin double");
		double s1 = scan.nextDouble();
		System.out.println("User please enter the value of sidelength in int");
		int s2 = scan.nextInt();
		scan.close();

	    Question17 q17 = new Question17();
		double side1 = q17.calculatePlotArea(s1);
		int side2 = q17.calculatePlotArea(s2);
		System.out.println("The plot area in double is " +side1);
		System.out.println("The plot area in int is " +side2);

	}

}
