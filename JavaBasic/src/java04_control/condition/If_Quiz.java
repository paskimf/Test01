package java04_control.condition;

import java.util.Scanner;

public class If_Quiz {

	public static void main(String[] args) {

		// 1번 문제

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int input = sc.nextInt();

		if (input < 0) {
			System.out.println("입력한 값은 음수");
		}

		else if (input == 0) {
			System.out.println("입력한 값은 0");
		}

		else {
			System.out.println("입력한 값은 양수");
		}

		System.out.println("=========");

		// 2번 문제

		Scanner sc1 = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int input1 = sc1.nextInt();

		if ((input1 % 3) == 0) {
			System.out.println("입력한 값은 3의 배수");
		}

		else {
			System.out.println("입력한 값은 3의 배수가 아님");
		}

		System.out.println("=========");

		// 3번 문제

		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.println("숫자1 입력: ");
		System.out.println("숫자2 입력: ");
		int input2 = sc2.nextInt();
		int input3 = sc3.nextInt();

		if (input2 > input3) {
			System.out.println("숫자1이 큼");
		}

		if (input2 < input3) {
			System.out.println("숫자2가 큼");
		}

		if (input2 == input3) {
			System.out.println("서로 같음");
		}

	}

}

//+ 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//>> Input Number : -3
//>> 음수입니다
//
//+ 입력한 데이터가 3의 배수인지 판별하시오
//(% 연산자 사용)
//>> Input Number : 7
//>> 3의 배수가 아닙니다
//
//+ 두 수를 입력 받아 큰 수를 출력하시오
//>> Input Number1 : 44
//>> Input Number2 : 88
//>> 88 이 더 큰 수
