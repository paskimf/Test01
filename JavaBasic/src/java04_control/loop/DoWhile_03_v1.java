package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input;
		int sum = 0;

		do {
			System.out.print("숫자 입력(0은 종료): ");
			input = sc.nextInt();
			sum += input;
		} while (input != 0);

		System.out.println("합계: " + sum);

	}

}

//		do {
//			// DoWhile 사용 예시
//			// -> 메뉴 화면, 선택
//
//			// ===== 메뉴 =====
//			// 1. 사용자 정보 입력
//			// 2. 사용자 검색
//			// 3. 사용자 전체 출력
//			// 4. 종료
//
//			// 메뉴 선택 >> 
//		} while();