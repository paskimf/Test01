package java04_control.loop;

public class For_04 {

	public static void main(String[] args) {

		// "zz"를 7번 반복 출력
		
		int sum = 0;
		
		for (int i = 0; i < 7; i++) {
			sum += i;
			System.out.println(i);
		}

	}

}

// 초기식: int i = 0; - i 변수 선언, 반복 구간의 시작값으로 대입, 주로 0
// 조건식: i < 7; - i 변수 검사, 반복 횟수보다 작은(<, lt) 조건으로 설정
// 증감식: i++ - 1씩 증가
