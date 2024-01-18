package java06_class.method.quiz;

public class Method_Quiz {

	// Q1. 1~100 출력 기능
	public void print100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("q1: " + i);
		}
	}

	// Q2. 전달인자 만큼 "Hello" 반복 출력
//	public void printHello() {
//		for (int j = 1; j <= 7; j++) {
//			System.out.println("q2: h");
//			// System.out.println("총 " + j + "번 출력");
//		}
//	}

	public void printHello(int count) {

		// i, 0~count1, count회
		for (int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
	}

	// Q3. 전달인자 숫자 만큼 전달인자 문자열을 반복 출력
	// 전달인자 문자열을 반복 출력

	public void printData(int count, String data) {

		for (int i = 0; i < count; i++) {
			System.out.println(data);
		}
	}

}
