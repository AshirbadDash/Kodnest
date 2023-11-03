import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender(male/female)");
		String gender = scan.next();
		scan.close();
		if (gender.equals("male")) {
			System.out.println("your gender is  male");

		} else if (gender.equals("female")) {
			System.out.println("your gender is female");
		} else {
			System.out.println("Invalid input. Please enter either 'male' or 'female'.");
		}

	}

}
