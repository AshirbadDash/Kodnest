import java.util.Scanner;

public class RectArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user please enter the side-1 value");
		int s1 = scan.nextInt();
		System.out.println("User please enter the side-2 value");
		int s2 = scan.nextInt();
		scan.close();

		calc c = new calc(s1, s2);
		new calc();
		System.out.println(c);

	}
}

class calc {
	int area;

	public calc() {

	}

	public calc(int s11, int s12) {
		this.area = s11 * s12;
		System.out.println("The area of the reactangle is "+ area);

	}

}
