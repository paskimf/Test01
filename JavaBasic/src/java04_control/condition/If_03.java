package java04_control.condition;

import java.util.Scanner;

public class If_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int input = sc.nextInt();
		
		if (input >= 1 && input <= 100) {
			System.out.println("입력한 값은 1~100 사이 정수");
		}
		
		if (!(input >= 1 && input <= 100)) {
			System.out.println("입력한 값은 1~100 사이 정수가 아님");
		}
		
//		else {
//			System.out.println("입력한 값은 1~100 사이 정수가 아님");
//		}
		
	}

}

