package com.day20.racking;

public class Question1_2 {
	void woThirdVariable(int a, int b) {
		System.out.println("before swap " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap " + a + " " + b);

	}

}
