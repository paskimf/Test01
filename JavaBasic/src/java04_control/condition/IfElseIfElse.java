package java04_control.condition;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력: ");

		int num = sc.nextInt();

		if (num == 10) {
			System.out.println("10입니다");
		}

		else if (num == 20) {
			System.out.println("20입니다");
		}

		else if (num == 30) {
			System.out.println("30입니다");
		}
		
		else {
			System.out.println("10, 20, 30 모두 아님");
		}
		
		System.out.println("===== 종료 =====");

	}

}

//		if (조건식1) {
//			// 조건식1이 참일때 수행하는 영역
//		}
//		
//		else if (조건식2){
//			// 조건식1이 거짓이고 조건식 2가 참일때 수행하는 영역
//		}
//		
//		else if (조건식3){
//			// 조건식1, 2가 거짓이고 조건식 3이 참일때 수행하는 영역
//		}
//		
//		else {
//			// 위 조건식이 모두 거짓일때 수행하는 영역
//		}

// else if 구문은 작성할 수 있는 개수에 제한이 없음
// else if, else 구문은 필수가 아님

// 단, if문 없이 else if, else만 사용 불가

// else만 사용하는 제어문은 if문 전체에서 마지막 한개만 쓸수있음
