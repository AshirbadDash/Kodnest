import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a number ");
		int c = scan.nextInt();
		if (c % 2 == 0) {
			System.out.println("Divisible by 2");
		} else {
			System.out.println("end");
		}
		scan.close();

	}
}