import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		if (number % 2 == 0 && number > 0) {
			System.out.println(number + " is a positive even number");
		}
		

		scan.close();

	}
}
