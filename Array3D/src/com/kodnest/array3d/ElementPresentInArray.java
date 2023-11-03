package com.kodnest.array3d;

import java.util.Scanner;

public class ElementPresentInArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the size of an array");
		int size = scan.nextInt();

		int[] marks = new int[size];
		System.out.println("User ! please enter the elements of an array");
		for (int i = 0; i < size; i++) {
			marks[i] = scan.nextInt();
		}

		System.out.println("User! please enter the value");
		int ele = scan.nextInt();
		boolean isInArray = false;

		for (int i = 0; i < marks.length; i++) {
			if (ele == marks[i]) {
				isInArray = true;
				break;
			}

		}

		if (isInArray) {
			System.out.println("The value is present in the array");
		} else {
			System.out.println("The value is not present in the array");
		}
		scan.close();

	}
}