import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("User please enter a number");
		int n = sc.nextInt();
		checkArmstrong(n);
		sc.close();

	}

	public static void checkArmstrong(int n) {
		int count = 0;
		int on = n;

		while (n > 0) {

			n = n / 10;
			count++;
		}

		System.out.println("The total number of digits is" + count);

		int rem = 0;
		int sum = 0;
		n = on;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (int) Math.pow(rem, count);
			n = n / 10;
		}
		System.out.println("sum = " + sum);

		count = 0;
		on = n;
		if (on == sum) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not Armstrong number");
		}
	}
}