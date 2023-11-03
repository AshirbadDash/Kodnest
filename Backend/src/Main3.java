import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a character in number ");
		int a = scan.nextInt();
		if (a % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("end");
		}
		scan.close();

	}
}