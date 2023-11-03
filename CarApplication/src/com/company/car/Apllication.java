package com.company.car;

public class Apllication {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "BMW";
		c.model= "s10";
		c.price =1450000000l;
		System.out.println(c.name);
		System.out.println(c.model);
		System.out.println(c.price);
		
		Car a = new Car();
		a.name = "audi";
		a.model = "xseries";
		a.price =9500000l;
		System.out.println(a.name);
				
		
	}
}
