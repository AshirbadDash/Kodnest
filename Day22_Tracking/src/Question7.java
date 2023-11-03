import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		if (number % 2 == 0 || number % 3 == 0) {
			System.out.println(number + " is divisible by 2 or 3");
		} else {
			System.out.println(number + " is not divisible by 2 or 3");
		}
	}

}
