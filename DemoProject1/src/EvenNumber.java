import java.util.Scanner;
class EvenNumber {
	public static void main(String[] args)

	{
		System.out.println("User ! please enter an integer value");
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		System.out.println("the squareof the given number is=" +findSquare(n)); 

	}
	public static int findSquare(int a)

	{
		return(a*a);
		

	}


}
