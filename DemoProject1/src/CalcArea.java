import java.util.Scanner;
class CalcArea {
	    public static void main(String[] args) {

	        area();
	        area(12.6);	        area(10, 12);
	        area(10);
	        area(12);
	        

	    }

	    	
	     static void area() {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("user ! please enter value of side of the square");
	        float side = scan.nextFloat();
	        System.out.println("Area of square=" + (side * side));

	    }

	    public static void area(float a)

	    {
	        float A = (9) * a * a;
	        System.out.println("The area of circle is " + A);

	    }

	    public static int area(int a, int b) {
	        int R = a * b;
	        System.out.println("The area of rectangle is " + R);
	        return R;

	    }

	    public static void area(double d)

	    {
	        Scanner scan= new Scanner(System.in);
	         int a = scan.nextInt();
	         int  b = scan.nextInt();
	        
	        System.out.println("the area of pyramid is " +0.5 *a*b);


	    }

	}


