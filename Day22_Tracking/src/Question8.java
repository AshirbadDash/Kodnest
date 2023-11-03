import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		scan.close();
		if (number % 4 == 0 && number % 3 == 0) {
			System.out.println(number + " is multiple of 4  and divisible by 3");
		} else {
			System.out.println(number + "is not  multiple of 4  and divisible by 3");
		}
	}

}
