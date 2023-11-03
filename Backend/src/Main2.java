import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User ! please enter a number");
		char c = scan.next().charAt(0);
		if (c == '2') {
			System.out.println("Number");
		} else {
			System.out.println("end");
		}
		scan.close();

	}
}