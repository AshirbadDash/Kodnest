
public class Pattern11 {
	static int n = 5;

	public static void main(String[] args) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			System.out.println();
			
		}
	}

}
