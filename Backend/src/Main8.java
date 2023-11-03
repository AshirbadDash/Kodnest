import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter the value of side-1 ");
		int c = scan.nextInt();
		System.out.println("User !please enter the value of side-2 ");
		int d = scan.nextInt();

		if (c == d) {
			System.out.println("The given shape is a square");
		} else {
			System.out.println("The given shape is not a square");
		}
		scan.close();

	}
}