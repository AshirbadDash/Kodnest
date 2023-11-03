import java.util.Scanner;

public class DivBy3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		int d = scan.nextInt();
		scan.close();
		if (d % 3 == 0) {
			System.out.println("The Entered no. is multiple of 3");
		} else {
			System.out.println("THe Entered no. is not a multiple of 3");
		}
	}

}
