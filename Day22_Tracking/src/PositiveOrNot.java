import java.util.Scanner;

public class PositiveOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int p = scan.nextInt();
		scan.close();
		if (p > 0) {
			System.out.println("Positive Number");
		} else if (p < 0) {
			System.out.println("Negative Number");

		}
	}

}
