import java.util.Scanner;

public class Main11{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User !please enter a number ");
		int c = scan.nextInt();
		if (c >0 ) {
			System.out.println("Number is positive");
		} else {
			System.out.println("end");
		}
		scan.close();

	}
}