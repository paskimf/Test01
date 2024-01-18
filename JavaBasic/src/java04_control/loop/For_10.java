package java04_control.loop;

public class For_10 {

	public static void main(String[] args) {

//		// 단 진행 반복
//		for (int i = 2; i < 10; i++) {
//
//			// 구구단 출력
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//
//			// 각 단의 구구단 출력 후 줄바꿈
//			System.out.println("===========");
//
//		}
		
		

//		// 단 진행 반복
//		for (int i = 2; i < 10; i++) {
//
//			// 구구단 출력
//			for (int j = 1; j < 10; j++) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			}
//
//			// 각 단의 구구단 출력 후 줄바꿈
//			
//
//		}
//		
//		System.out.println("");
		

		// 단 진행 반복
		for (int i = 1; i < 10; i++) {

			// 구구단 출력
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}

			// 각 단의 구구단 출력 후 줄바꿈
			System.out.println("===========");

		}

	}

}
