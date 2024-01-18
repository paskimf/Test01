package java04_control.loop;

public class Star_12 {

	public static void main(String[] args) {

		// Q1
		for (int i = 0; i < 1; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}

			System.out.println("");
			System.out.println("============");

		}

		// Q2
		for (int i = 0; i < 1; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.println("*");
			}

		}

		System.out.println("============");

		// Q3
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}

			System.out.println("");

		}

		System.out.println("============");

		// Q4
		for (int i = 1; i < 6; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(i);
			}

			System.out.println("");

		}

		System.out.println("============");

		// Q5
		for (int i = 0; i < 5; i++) {

			for (int j = 4; j < 5; j++) {
				System.out.print(12345);
			}
			
			System.out.println("");

		}
		
		System.out.println("============");

		// Q8
		for (int i = 1; i < 6; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("");

		}

		System.out.println("============");

		// Q9
		for (int i = 5; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("");

		}
		
		System.out.println("============");

	}
}
