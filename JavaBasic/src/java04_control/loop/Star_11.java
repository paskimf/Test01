package java04_control.loop;

public class Star_11 {

	public static void main(String[] args) {

		// Q11
		for (int i = 4; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int w = 0; w < 5 - i; w++) {
				System.out.print("*");
			}

			System.out.println("");

		}

	}
}
