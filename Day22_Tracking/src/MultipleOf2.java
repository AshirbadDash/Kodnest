import java.util.Scanner;

public class MultipleOf2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is multiple of 2");
		int mul = scan.nextInt();
		scan.close();

		if (mul % 2 == 0) {
			System.out.println("The Entered no. is a multiple of 2");
		} else {
			System.out.println("The Entered no. is not a multiple of 2");
		}
	}

}
