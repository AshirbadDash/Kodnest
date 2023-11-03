import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User ! please enter a Number ");
		int c = scan.nextInt();
		if (c % 3 == 0) {
			System.out.println("Divisible by 3");
		} else {
			System.out.println("Not-divisible by 3");
		}
		scan.close();

	}
}