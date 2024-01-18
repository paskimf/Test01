package java04_control.loop;

public class For_01 {

	public static void main(String[] args) {

		// 코드 반복을 조절하는데 사용하는 변수
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println("zz: " + i);
		}

		System.out.println("============");

		System.out.println("for문이 끝난 이후 i의 최종값: " + i);

	}

}

// 반복문(loop)
// for, while, do-while

// for문 or for loop

//		for ( 초기식; 조건식; 증감식) {
//			// 조건식이 참일때 실행하는 영역
//			// 반복적으로 실행하는 코드 영역
//			// 조건식이 거짓이어야만 벗어남
//		}

// for문 실행 순서
// 1. 초기식 실행
// 2. 조건식 판단
//  2-1. true일때 3번 항목 실행
//  2-2. false일때 for문 중단(반복문 중단)
// 3. {} 중괄호 영역 실행
// 4. 증감식 실행
// 5. 2번 항목 실행

//for (i = 0; i < 5; i++) {

// 초기식 i=0
// 조건식 i<5
// 증감식 ㅑ++

// for문 읽는 방법

// i 변수가 0부터 시작해서 - 초기식
// i 변수가 5보다 작은동안에 - 조건식
// i 변수가 1씩 증가시키면서 - 증감식
// {} 중괄호 코드 영역을 실행시킨다
