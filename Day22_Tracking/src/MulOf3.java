import java.util.Scanner;

public class MulOf3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int mul =scan.nextInt();
		scan.close();
		
		if(mul%3==0&&mul%5==0) {
			System.out.println(mul+"The entered No. is Multiple of 3 and 5");
		}
		else {
			System.out.println(mul+"The Entered no. is not a multiple of 3 and 5");
		}
	}
}
