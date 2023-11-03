import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a character in capital letter ");
		char c = scan.next().charAt(0);
		if (c == 'M') {
			System.out.println("Male");
		}
		if (c == 'F') {
			System.out.println("Female");
		}
		scan.close();

	}
}