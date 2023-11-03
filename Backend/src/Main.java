import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a character in capital letter ");
		char c = scan.next().charAt(0);
		if (c == 'A') {
			System.out.println("Upper case letter");
		} else {
			System.out.println("end");
		}
		scan.close();

	}
}