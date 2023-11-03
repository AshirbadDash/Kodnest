import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		System.out.println("user !please enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("The Reverse of number is " + rev);
		scan.close();
	}
}