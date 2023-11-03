import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a number ");
		double c = scan.nextInt();
		if (c >= 90) {
			System.out.println("for a percentage of" + c + "%" + "the grade is A");
		} else if (c >= 80) {
			System.out.println("for a percentage of" + c + "%" + "the grade is B");
		} else if (c >= 70) {
			System.out.println("for a percentage of" + c + "%" + "the grade is c");
		} else if (c >= 60) {
			System.out.println("for a percentage of" + c + "%" + "the grade is D");
		} else {
			System.out.println("invalid");
		}
		scan.close();

	}
}