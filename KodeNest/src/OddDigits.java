import java.util.Scanner;

//sum of odd digits present in the given number 
public class OddDigits {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number");
		int x = scan.nextInt();
		scan.close();
		oddDigits(x);

	}

	static void oddDigits(int n) {
		while (n > 0) {
			int sum = 0;
			while (n > 0) {

				int rem = n % 10;
				if (rem % 2 == 1) {

					sum = sum + rem;
					n = n / 10;
				}
				n = sum;

				System.out.println("The sum of oddDigits NUmber is :" + sum);
			}
		}

	}
}
