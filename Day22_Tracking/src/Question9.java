import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		if (number % 2 == 0 || number % 6 == 0) {
			System.out.println(number + " is multiple of 4 and divisible by 6");
		} else {
			System.out.println(number + " is not multiple of 4 and divisible by 6");
		}
	}

}
