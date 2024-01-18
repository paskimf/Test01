package java04_control.loop;

public class Star_10 {

	public static void main(String[] args) {

		// Q10
		for (int i = 5; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int w = 0; w < i; w++) {
				System.out.print("*");
			}

			System.out.println("");

		}

	}
}
