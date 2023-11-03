import java.util.Scanner;

public class simpleIntrest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the principal value");
		double principal = scan.nextDouble();
		System.out.println("User please enter the rate value");
		double rate = scan.nextDouble();
		System.out.println("User please enter the time value");
		double time = scan.nextDouble();
		scan.close();

		Si s = new Si();
		System.out.println("The simple instrest is "+s.si(principal, rate, time));

	}

	static class Si {
		double si(double p, double rate, double time) {
			double calc = p * rate * time;
			return calc;
		}

	}
}
