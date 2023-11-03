package com.kodnest.DSA;

public class Solution1 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping the values are.." + a + " " + b);
		// logic 1-Third variable
		/*
		 * int t = a; a = b; b = t;
		 */

		// logic 2- use + & - without using third variable
		/*
		 * a = a + b; // 10+20=30 b = a - b; // 30-20=10 a = a - b; // 30-10=20
		 */

		// logic 3- use xor
		/*
		 * a = a ^ b; b = a ^ b; a = a ^ b;
		 */

		// logic 4
		b = a + b - (a = b);

		System.out.println("After swapping values are.." + a + " " + b);

	}

}
