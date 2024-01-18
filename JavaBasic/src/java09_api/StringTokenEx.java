package java09_api;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {

		// 문자열의 토큰화(Tokenize)
		String data1 = "AA BB CC";

		String[] tokens = data1.split(" ");

		for (String token : tokens) {
			System.out.println(token);
		}

		System.out.println("========================");

		String data2 = "I@#am@#Fire-Fighter";

		for (String token : data2.split("@#")) {
			System.out.println(token);
		} // $는 구분 안됨

		System.out.println("========================");

		StringTokenizer st1 = new StringTokenizer(data1); // 기본 구분자: 공백문자
		System.out.println("토큰의 개수: " + st1.countTokens());

		// 토큰이 존재하는 만큼 반복하기
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("========================");
		
		StringTokenizer st2 = new StringTokenizer(data2, "@#");
		
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		
		// 예외 발생
		// -> NoSuchElementException
		// -> nextToken()으로 반환할 데이터가 더 이상 존재하지 않음
		// System.out.println(st2.nextToken());

	}

}

// 문자열 토큰, String Token
// -> 특정 규칙은 이용해서 문자열을 구분하는 단위

// ex) "1, 2, 3, 4, 5"
// -> ","를 이용해서 구분한다 - 구분자(delimiter)
// -> 토큰: "1", "2", "3", "4", "5"

// .nextToken() 메소드
// 현재 토큰 문자열을 반환한다
// 다음 토큰을 반환할 준비를 한다

// .hashMoreTokens() 메소드
// 반환할 토큰이 남아있는지 boolean 값으로 리턴한다
