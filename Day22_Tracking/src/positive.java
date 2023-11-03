import java.util.Scanner;

public class positive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int i = scan.nextInt();
		scan.close();

		if (i > 0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is Negative");
		}
	}

}
