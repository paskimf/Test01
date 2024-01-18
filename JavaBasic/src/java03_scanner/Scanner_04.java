package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
				
		String str = "Apple Banana";
		char returnData = str.charAt(0);
		
		System.out.println(returnData);
		
		
		
		System.out.print("입력: ");
		String data = sc.nextLine();
		
		System.out.println(data.charAt(0));
		
		
		
		System.out.println("=============");
		
		
		
		System.out.print("입력: ");
		char charData = sc.nextLine().charAt(0);
		
		System.out.print(charData);
		
	}

}

// Scanner를 이용한 char 값 처리하기
// -> Scanner 클래스에는 char를 직접 입력하는 기능이 없다.
// -> String타입은 char형 데이터를 나열해놓은 구조이다.
// -> String으로 입력받은 문자열의 첫 글자를 char형으로 사용한다.

