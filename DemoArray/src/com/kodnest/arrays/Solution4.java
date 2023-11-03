package com.kodnest.arrays;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("User ! please enter the size of array");
		int size = sc.nextInt();
		byte[] a = new byte[size];

		System.out.println("User ! please eter the elemnts of array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextByte();
		}
		sc.close();

		byte min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("The min element of array is :" + min);

	}

}
