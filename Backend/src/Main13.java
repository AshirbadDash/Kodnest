import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a number ");
		int c = scan.nextInt();
		if (c > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("The number is negative");
		}
		scan.close();

	}
}