package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		
		int num = sc.nextInt();	

		if ((num % 2) == 0) {
			System.out.println("입력한 값은 짝수");
		}

		else {
			System.out.println("입력한 값은 홀수");
		}
		
	}

}

// 입력한 숫자가 짝수/홀수 판단