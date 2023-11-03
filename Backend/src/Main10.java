import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a number");
		int c = scan.nextInt();
		if (c > 30 && c < 300) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		scan.close();

	}
}