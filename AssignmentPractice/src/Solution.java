import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("User! please enter a ");
		Scanner scan = new Scanner(System.in);
		//		int ch = scan.nextInt();
		// System.out.println("User! please enter operand 1");
		// int a = scan.nextInt();
		// System.out.println("User! please enter operand 2");
		// int b = scan.nextInt();
		//		boolean value = scan.nextBoolean();
		//		byte value = scan.nextByte();
		//		long value = scan.nextLong();
		//		double value = scan.nextDouble();
		String value= scan.next();
		switch (value) {
		case "one":if(2>0)
			System.out.println("One");
		else {
			System.out.println("2 is odd");
		}
		// stmts-statements

			break;
		}
		switch (value) {
		case "one":
			System.out.println("One");// stmts-statements
		default:
			System.out.println("Invalid Operator");
			// break;(no use it is optional)


		}
		scan.close();

	}
}



