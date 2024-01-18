package java04_control.selection;

public class Switch_02 {

	public static void main(String[] args) {

		int num = 30;

		if (num == 10) {
			System.out.println("10");
		}

		else if (num == 20) {
			System.out.println("20");
		}

		else if (num == 30) {
			System.out.println("30");
		}

		else {
			System.out.println("모두 아님");
		}

		System.out.println("====================");

		int score = 88;

		if (score >= 90) {
			System.out.println("A");
		}

		else if (score >= 80) {
			System.out.println("B");
		}

		else if (score >= 70) {
			System.out.println("C");
		}

		System.out.println("====================");

		int score1 = 99;

		switch (score1 / 10) {
		
		case 10:
		case 9:
			System.out.println("A");
			break;

		case 8:
			System.out.println("B");
			break;
		}

	}

}
