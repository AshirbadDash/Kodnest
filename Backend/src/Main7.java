import java.util.Scanner;

 public class Main7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter your Income ");
		int c = scan.nextInt();
		if (c <=700000) {
			System.out.println("Income is 7,00,000 or less.No tax is required.");
		} else {
			System.out.println("Income is greater than7,00,000.Tax must be paid.");
		}
		scan.close();

	}
}