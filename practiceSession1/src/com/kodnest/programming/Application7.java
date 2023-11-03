package com.kodnest.programming;

import java.util.Scanner;

public class Application7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user please enter your marks from sem-1 to sem-8");
		int sem1 = scan.nextInt();
		int sem2 = scan.nextInt();
		int sem3 = scan.nextInt();
		int sem4 = scan.nextInt();
		int sem5 = scan.nextInt();
		int sem6 = scan.nextInt();
		int sem7 = scan.nextInt();
		int sem8 = scan.nextInt();
		scan.close();

		Question7 q7 = new Question7();
		double average = q7.calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
		System.out.println("The averageof 8 semister is =" + (average / 8));

	}

}
