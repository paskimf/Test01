package java03_scanner;

import java.util.Scanner;

public class Scanner_05 {

	public static void main(String[] args) {
		
		// 입력 객체
		Scanner sc = new Scanner(System.in);
		//Scanner sc1 = new Scanner(System.in);
		
		System.out.println("===== 입력 =====");
		
		System.out.print("숫자 입력: ");		
		String num = sc.nextLine();
		
		System.out.print("문자 입력: ");
		sc.nextLine(); // 입력 버퍼 비우기, 버퍼에 남은 '\n'을 제거함
//		sc.skip("[\\r\\n]+"); // 입력 버퍼의 '\r', '\n'을 모두 제거함
		String str = sc.nextLine(); 
		
		System.out.println();		
		System.out.println("===== 출력 =====");
		
		System.out.println("숫자: " + num);
		System.out.println("문자: " + str);	
		
	}

}

// nextLine()을 제외한 모든 메소드 문제 있음




