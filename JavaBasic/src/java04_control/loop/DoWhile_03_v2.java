package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input;
		int sum = 0;

		while (true) {
			
			System.out.print("숫자 입력(0은 종료): ");
			input = sc.nextInt();

			if (input == 0) {
				break;
			}
			sum += input;			
		}

		System.out.println("합계: " + sum);

	}

}
