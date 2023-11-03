package com.kodnest.programming;

import java.util.Scanner;

public class Application10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Value");
		char c = scan.next().charAt(0);
		scan.close();

		Question10 q10 = new Question10();
		q10.decode(c);

	}

}