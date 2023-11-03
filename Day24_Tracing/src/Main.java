import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		//		int a = scan.nextInt();
		char c = scan.next().charAt(0);
		scan.close();


		switch(c) {
		case 'A':
		case 'B':
		case 'C':	
		case 'D':
		case 'E':
			System.out.println("Pass");
			break;
			//		case 6:
			//		case 7:
			//		case 8:
			//		case 9:
			//		case 10:System.out.println("Number is 6-10");
			//		   break;
		default:System.out.println("Out of range");


		}

	}
}