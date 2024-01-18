package java04_control.loop;

public class DoWhile_01 {

	public static void main(String[] args) {

		// 무한루프
//		do {
//			System.out.println("zz");
//		} while(true);

		do {
			System.out.println("zz");
		} while(false);

	}

}

// do-while loop

//		do {
//			// 반복 수행하는 코드 영역
//		} while(조건식);

// 처음 do 키워드를 만나면 조건 검사없이 {}중괄호 코드를 실행한다.
// 이후에 조건식 검사를 하고 true면 do부터 반복 false면 중단
// -> 최초 1회를 무조건 실행하고 다음부터 조건에 따라 반복을 결정
