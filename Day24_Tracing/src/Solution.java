import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User!please enter number-1");
		int a = scan.nextInt();
		System.out.println("User !please enter the number-2");
		int b = scan.nextInt();

		System.out.println("User! please enter an operator");
		char ch = scan.next().charAt(0);
		scan.close();
		if (ch == '+') {
			System.out.println(a + b);
		} else if (ch == '-') {
			System.out.println(a - b);
		} else if (ch == '*') {
			System.out.println(a * b);
		} else if (ch == '/') {
			System.out.println(a / b);
		} else if (ch == '%') {
			System.out.println(a % b);

		} else {
			System.out.println("Invalid operator");
		}

	}
}