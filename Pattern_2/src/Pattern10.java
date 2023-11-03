
public class Pattern10 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < i; j++) {
				if (i != 6) {
					if (j == 0 || j == i - 1) {

						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
