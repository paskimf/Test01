package java04_control.loop;

public class While_02 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) { // i, 0~9, 10번 반복
			System.out.println(i);
		}

		System.out.println("===============");

		// 초기식
		int i = 0;
		while (i < 10) { // 조건식			
			System.out.println(i);			
			// 증감식
			i++;			
		}

	}

}

//		초기식; // while 구문이 시작되기 전에 작성
//		while (조건식) { // while 구문의 ()소괄호 작성
//			
//			// 조건식이 참(true)일때 실행할 코드
//			
//			증감식; // while 구문의 {}중괄호 안쪽 제일 마지막으로 작성

// for문은 반복 횟수가 정해져있거나 정수값으로 반복 진행을 확인할 수 있을때 주로 사용함

// while문은 반복 횟수가 정확하지 않거나 정해지지 않았을때 사용
// -> 반복을 종료해야하는 조건만 주어졌을때 사용함