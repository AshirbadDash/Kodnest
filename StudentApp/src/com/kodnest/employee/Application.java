package com.kodnest.employee;

public class Application {
	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.name = "Ashirbad";
		E1.age = 21;
		E1.id = "a1213d";
		E1.salary = 1200000l;
		E1.work();
		E1.meeting();
		System.out.println("The name of employee E1 is : " + E1.name);
		System.out.println("The id of employee E1 is : " + E1.id);
		System.out.println("The age of employee E1 is : " + E1.age);
		System.out.println("The salary of employee E1 is : " + E1.salary);

		Employee E2 = new Employee();
		E2.name = "employee2";
		E2.age = 21;
		E2.id = "e1214689h";
		E2.salary = 1200000l;
		E2.work();
		E2.meeting();
		System.out.println("The name of employee E2 is : " + E2.name);
		System.out.println("The id of employee E2 is : " + E2.id);
		System.out.println("The age of employee E2 is : " + E2.age);
		System.out.println("The salary of employee E2 is : " + E2.salary);

	}

}
