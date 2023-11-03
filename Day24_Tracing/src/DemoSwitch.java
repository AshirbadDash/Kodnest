import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		System.out.println("User please enter number-1");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("USer please enter number-2");
		int b = scan.nextInt();
		System.out.println("User! please enter the operator");
		int ch = scan.nextInt();

		switch (ch) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a * b);
			break;
		default:
			System.out.println("Invalid Operator");
			//			break;(no use it is optional)

		case 4:
			System.out.println(a / b);
			break;
		case 5:
			System.out.println(a % b);
			break;
		}
		scan.close();

	}

}
