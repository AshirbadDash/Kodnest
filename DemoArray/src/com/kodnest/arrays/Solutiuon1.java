package com.kodnest.arrays;

import java.util.Scanner;

public class Solutiuon1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// create an integer array of size 4
//		int a[] = new int[4];
		System.out.println("User ! please enter the size of an Array");
		int size = scan.nextInt();
		int a[] = new int[size];
		System.out.println(a.length + " is the size of an Array");
		// read elements into the array
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		System.out.println("User! please enter " + size + " integer elements of an array");

		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
		}

//		int s1 = 10;
//		int s2 = 20;
//		int s3 = 30;
//		int s4 = 40;

		// write elements from the array
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);

		System.out.println("The" + size + "  integer elements of an array are: ");
//		
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
		scan.close();
		// System.out.println("Student-1 marks=" + s1);
		// System.out.println("Student-2 marks=" + s2);
		// System.out.println("Student-3 marks=" + s3);
		// System.out.println("Student-4 marks=" + s4);

	}
}
