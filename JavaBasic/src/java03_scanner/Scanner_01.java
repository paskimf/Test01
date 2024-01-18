package java03_scanner;

import java.util.Scanner;

import java01_variables.Variables_01;

public class Scanner_01 {

	public static void main(String[] args) {
		
		// 기본형 변수
		int num;
		num = 123;
		
		// 참조형 변수
		Scanner sc;
		
		// new Scanner() - 입력 기능 생성(활성화)
		// System.in - 키보드
		// sc - 키보드 입력 기능 객체
		// nextInt() - 정수 값 추출하여 프로그램으로 가져오는 기능
		sc = new Scanner(System.in);
		
		System.out.println(sc);
		
//		Variables_01 v01 = new Variables_01();
//		System.out.println(v01);
		
		System.out.print("숫자 입력: ");
		int data = sc.nextInt();
		System.out.println("입력된 값: " + data);
		
		System.out.println("------------------");
		
		System.out.print("실수 값 입력: ");
		System.out.println("입력된 실수: " + sc.nextDouble());
		
		// 자원 해제(반납)
		// -> 프로그램에 연결해서 사용하던 자원(키보드)의 사용 종료
		sc.close();
		
	}

}

// 스캐너 클래스

// 키보드로 입력한 내용을 프로그램 데이터로 가져오는 기능 클래스

// 입력 기능 클래스