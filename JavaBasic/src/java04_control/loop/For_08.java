package java04_control.loop;

public class For_08 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				System.out.println("짝수: " + i);
			}

//			else {
//				System.out.println("홀수: " + i);
//			}

			System.out.println("================");

			for (int i1 = 0; i1 < 10; i1 += 2) {
				System.out.println("짝수: " + i1);
			}

		}

	}

}

// 제어문 중첩시켜 사용하기
// for문과 if문 중첩