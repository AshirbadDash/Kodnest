import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		scan.close();
		if (number % 3 == 0 || number % 5 == 0 && number % 7 == 0) {
			System.out.println(number + " is multiple of 3 or 5 and divisible by 7");
		} else {
			System.out.println(number + "  is multiple of 3 or 5 and divisible by 7");
		}
	}

}
