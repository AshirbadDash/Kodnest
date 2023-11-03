import java.util.Scanner;

class CalculatorApp {
	public static void main(String[] args) {
		int n1, n2, add, subtract, multiply, modulus;
		float divide;
		Scanner scan = new Scanner(System.in);
		System.out.println("User ! please enter Two Numbers : ");
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();

		add = n1 + n2;
		subtract = n1 - n2;
		multiply = n1 * n2;
		divide = (float) n1 / n2;
		modulus = n1 % n2;

		System.out.println("Sum = " + add);
		System.out.println("Difference = " + subtract);
		System.out.println("Multiplication = " + multiply);
		System.out.println("Quotient = " + divide);
		System.out.println("Remainder = " + modulus);

	}

}
