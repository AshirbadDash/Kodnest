import java.util.Scanner;

public class DemoScan {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("User ! please enter the value in int");
			int z = scan.nextInt();
			System.out.println(z);
		}

	}

}
