import java.util.Scanner;

public class cubertNumber {
	public static void main(String[] args) {
		System.out.println("User!please enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		cubertnumber(n);
		sc.close();

	}

	static void cubertnumber(int n) {
		System.out.println("the cube root= " + (int) Math.cbrt(n));
	}

}
