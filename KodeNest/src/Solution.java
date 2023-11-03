import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		while (sc.hasNext()) {
			String inputString = sc.next();
			int inputInt = sc.nextInt();

			// Use printf to format and print the output
			System.out.printf("%-15s%5"
					+ "d%n", inputString, inputInt);
		}
		
		

		sc.close();
		System.out.println("================================");

	}
}