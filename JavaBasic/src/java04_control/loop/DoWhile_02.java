package java04_control.loop;

public class DoWhile_02 {

	public static void main(String[] args) {

		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		} while (i < 5);

	}

}

// 숫자를 여러개 입력받아 모든 값들의 총합을 구하고 최종 합계를 출력하는 프로그램
// -> 숫자 0을 입력하면 종료
// -> do-while 구문 활용하기