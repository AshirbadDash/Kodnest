import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		// x and y are the numbers to find the GCF
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number 1");
		int x = scan.nextInt();
		System.out.println("User! please enter the number 2");
		int y = scan.nextInt();
		int gcd = 1;
		findGcd(x, y, gcd);
		scan.close();
	}

	// running loop form 1 to the smallest of both numbers
	static void findGcd(int a, int b, int c) {
		for (int i = 1; i <= a && i <= b; i++) {
			// returns true if both conditions are satisfied
			if (a % i == 0 && b % i == 0)
				// storing the variable i in the variable GCD

				c = i;
		}

		// prints the GCD
		System.out.printf("GCD of %d and %d is: %d", a, b, c);
	}
}