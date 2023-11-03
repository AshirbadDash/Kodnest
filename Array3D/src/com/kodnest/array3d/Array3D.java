package com.kodnest.array3d;

import java.util.Scanner;

public class Array3D {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("User please enter the row of array");
		int row = sc.nextInt();
		System.out.println("User please enter the column of array");
		int column = sc.nextInt();
		System.out.println("User please enter the height of array");
		int height = sc.nextInt();

		
		
		// Declaration or creation of 3D-array
		int[][][] a = new int[row][column][height];
//		System.out.println("user please enter the elements of an array");

		// reading the elements of 3D-array
		System.out.println("User please enter elements of array");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < a[i].length; j++) {

				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		// Displaying the elements of 3D-array

		System.out.println("Array Values of a are: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {

					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		sc.close();
	}
}
