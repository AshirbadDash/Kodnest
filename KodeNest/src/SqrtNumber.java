import java.util.Scanner;

public class SqrtNumber {
	public static void main(String[] args) {
		System.out.println("User!please enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sqrtnumber(n);
		sc.close();

	}

	static void sqrtnumber(int n) {
		System.out.println("the square root= " + (int)Math.sqrt(n));
	}

}
