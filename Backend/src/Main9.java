import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a character in capital letter ");
		char c = scan.next().charAt(0);
		if (Character.isUpperCase(c)) {
			System.out.println("Upper case");
		} else {
			System.out.println("Lower case");
		}
		scan.close();

	}
}