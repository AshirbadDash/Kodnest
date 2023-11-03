import java.util.Scanner;

public class Main15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		if (h < 12) {
			System.out.println("Greeting: Good morning");

		} else if (h >= 12 || h < 18) {
			System.out.println("Greeting:Good Afternoon");

		} else if (h >= 18 || h < 24) {
			System.out.println("Greeting:Good Evening");
		} else {
			System.out.println("invalid input");
		}
		scan.close();

	}

}
