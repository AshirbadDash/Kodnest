package com.kodnest.programming;
import java.util.Scanner;


public class Question3	 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user please enter the value in int");
		int a = scan.nextInt();
		Application3 q3 = new Application3();
		System.out.println("the double value is "+ q3.doubleTheNumber(a));
		scan.close();
		
	}

}
