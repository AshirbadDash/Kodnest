package com.kodnest.arrays;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User! please enter the total no  of classes");
		int class_size = sc.nextInt();
		System.out.println("User! please enter the total no  of students");
		int student_size = sc.nextInt();

// 2-D array creation that contains 3 classes and 3 students

		int[][] marks = new int[class_size][student_size];

//reading

		System.out.println("User! please enter the marks of " + student_size + " students" + " present in " + class_size
				+ " class are");

		for (int classes = 0; classes < marks.length; classes++) {
			for (int students = 0; students < marks[classes].length; students++) {
				marks[classes][students] = sc.nextInt();
			}
		}

//		marks[class_size][student_size] = 10;
//		marks[class_size][student_size] = 20;
//		marks[class_size][student_size] = 30;
//
//		marks[class_size][student_size] = 40;
//		marks[class_size][student_size] = 50;
//		marks[class_size][student_size] = 60;
//
//		marks[class_size][student_size] = 70;
//		marks[class_size][student_size] = 80;
//		marks[class_size][student_size] = 90;
//
//displaying
		System.out
				.println("The marks of " + student_size + " students " + " present in " + class_size + " classes are");
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
//		System.out.print(marks[0][0]);
//		System.out.print(marks[0][1]);
//		System.out.print(marks[0][2]);
//		System.out.println();
//
//		System.out.print(marks[1][0]);
//		System.out.print(marks[1][1]);
//		System.out.print(marks[1][2]);
//		System.out.println();
//
//		System.out.print(marks[2][0]);
//		System.out.print(marks[2][1]);
//		System.out.print(marks[2][2]);
		sc.close();

	}
}