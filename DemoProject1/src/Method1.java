class Method1 {
	public static void add() {
		System.out.println("The reasult is :");

	}

	public static void add(int a) {
		System.out.println("The reasult is :" + (a));

	}

	public static void add(int a, int b) {
		System.out.println("The reasult is :" + (a + b));
	}

	public static void add(double a, int b) {
		System.out.println("The reasult is :" + (a + b));

	}

	public static void add(int a, double b) {
		System.out.println("The reasult is :" + (a + b));
	}

	public static void main(String[] args) {
		add();
		add(10);
		add(10,20);
		add(48.47,10);
		add(70,89.87);
		//add(40.47,48.94);
		add((int)48.47,(int)48.94);

	}

}