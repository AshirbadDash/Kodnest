package com.kodnest.arrays;

import java.util.Scanner;

public class EvenElementsOfArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("user !please enter the size of the array");
		int size = scan.nextInt();

		// create an array
		int[] a = new int[size];

		// read the elements of array
		System.out.println("USer please enter the " + size + "elements of an array");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Even index elements of an array");

		{
			for (int i = a.length; i >= 0; i--) {
//				if (i % 2 == 0) {
				System.out.println(a[i]);

			}
//			}

		}
	}

}
