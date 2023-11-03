import java.util.Scanner;

public class export {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user please enter a number");
		int n = scan.nextInt();
		scan.close();
		System.out.println(getSum(n));

	}

	static int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem; // n % 10;
			n = n / 10;
		}
		
		return sum;
	}

}
