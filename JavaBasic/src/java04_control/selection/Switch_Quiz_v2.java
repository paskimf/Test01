package java04_control.selection;

import java.util.Scanner;

public class Switch_Quiz_v2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input;
		
		// 메뉴 번호 상수
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;

		do {
			System.out.println("===============================");
			System.out.println("menu");
			System.out.println("===============================");
			System.out.println("1. Hello World 출력");
			System.out.println("2. 이름 출력");
			System.out.println("3. 성별 출력");
			System.out.println("4. 종료");
			System.out.print("입력: ");

			input = sc.nextInt();
			
			// RunMenu 객체 활성화
			// -> RunMenu 클래스의 사용할 수 있도록 연결됨
			RunMenu rm = new RunMenu();
			
			// 메소드 호출 테스트
			// rm.apple();
					
			System.out.print(">> ");

			switch (input) {

			case HELLO_MENU:
				rm.printHello();
				break;

			case NAME_MENU:
				rm.printName();
				break;

			case GENDER_MENU:
				rm.printGender();
				break;
				
			case EXIT_MENU:
				rm.printExit();
				break;

			default:
				System.out.println("값을 잘못 입력");
				break;

			}

		} while (input != 4);

	}

}

//- 메뉴 만들기
//
//===============================
// M  e  n  u
//===============================
// 1. Hello World 출력
// 2. 이름 출력
// 3. 성별 출력
// 4. 종료
//===============================
//
//>> _
//
//-> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//-> 동작은 간단한 출력으로 해결
