class DemoMethods {
	public static void getBill() {
		System.out.println("The Bill is  ");

	}

	public static void getBill(int quantity) {
		System.out.println("The bill is " + (10 * quantity));

	}

	public static void getBill(String type) {
		System.out.println("The bill for " + type + "is 20");

	}

	public static void getBill(int quantity, String type) {
		System.out.println("The bill for " + quantity + " " + type + " is " + (20 * quantity));
	}

	public static void main(String[] args) {
		getBill();
		getBill(4);
		getBill("Masala chai");
		getBill(4, "Masala chai");

	}
}
