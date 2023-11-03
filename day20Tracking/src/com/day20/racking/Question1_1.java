package com.day20.racking;

public class Question1_1 {
	void thirdVariable(int a, int b) {
		System.out.println("before swap "+a+" "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("after swap " + a + " " + b);

	}

}
