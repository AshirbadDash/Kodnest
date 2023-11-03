package com.kodnest.arrays;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {

		System.out.println("User ! please enter the size of array");
		Scanner sc = new Scanner(System.in);
		byte size = sc.nextByte();

		byte[] a = new byte[size];

		// reading the elements of array
		System.out.println("User ! please enter  the elements of array");
		for (int i = 0; i <= a.length; i++) {
			a[i] = sc.nextByte();

		}

		// printing the elements of array
//		System.out.println("The elements of array are");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		sc.close();
		// find the maximum elements of an array

		// assume the first element of array as max value
		byte max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println("the maximum element is= " + max);

	}

}
