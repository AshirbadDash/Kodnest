
import java.util.Scanner;

public class SingleDigit {
	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n > 9) {
			int sum = 0;
			while (n > 0) {

				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		System.out.println(n);
		s.close();

	}
}