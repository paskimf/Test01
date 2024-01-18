package java04_control.loop;

public class Star_14 {

	public static void main(String[] args) {

		// Q11
		for (int i = 3; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int w = 0; w < 7 - i; w++) {
				System.out.print("*");
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print("");
			}

			System.out.println("");

		}

	}

}

//    *
//   ***
//  *****
// *******