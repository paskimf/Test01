package java03_scanner;

import java.util.Scanner;

public class Scanner_03 {

	public static void main(String[] args) {
		
		// 문자열 입력 메소드
		// nextLine()
		// next
		
		// 키보드 입력 객체
		Scanner sc = new Scanner(System.in);
		
		// 문자열 변수
		String str1;
		String str2;
		
		System.out.print("문자 입력: ");
		
//		str1 = sc.nextLine();
//		str2 = sc.nextLine();
		str1 = sc.next();
		str2 = sc.next();
		
		System.out.print("str1: " + str1 + " str2: " + str2);
		
	}

}

// nextLine() - '\n'
// 개행문자(엔터 값)을 기준으로 입력한 한 줄을 하나의 데이터 판단

// next() - '\n', ' ', '\t'
// 공백문자(white space)들을 기준으로 하나의 데이터 판단

//nextInt(), nextDouble() 등의 다른 입력 메소드들은 next()처럼 공백 문자들을 기준으로 판단함