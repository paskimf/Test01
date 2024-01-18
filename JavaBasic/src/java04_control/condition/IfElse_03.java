package java04_control.condition;

import java.util.Scanner;

public class IfElse_03 {

	public static void main(String[] args) {

		int num = 33;

		if (num > 0 && num <= 100) {
			System.out.println("num은 1~100사이의 정수");
		}

		System.out.println("======================");

		if (num > 0) {
			System.out.println("0보다 큼");

			if (num <= 100) {
				System.out.println("0보다 큼");
				System.out.println("100보다 작거나 같다");
			}

			System.out.println("0보다 큼");

		}

		else {
			System.out.println("0보다 크지 않음");
			System.out.println("0보다 작거나 같음");

			if (num == 0) {
				System.out.println("0과 같음");
			}
			
			else {
				System.out.println("0보다 작음");
			}
		}

	}

}
