package java04_control.condition;

import java.util.Scanner;

public class If_02 {

	public static void main(String[] args) {

		int num = 10;
		// int num = new Scanner(System.in).nextInt();

		if (num == 10) {
			System.out.println("aa");
		}

//		else if (num == 10) {
//			System.out.println("aa");
//		}

		System.out.println("======");

		{
			System.out.println("ccc");
			System.out.println("zz");
			System.out.println("aaa");

			// 제어문은 해당 제어문 다음에 오는 코드 한개 또는 {} 중괄호 블록 하나에 영향을 준다.
			if (false) {
				System.out.println("11"); // 실행되지 않음(if 영향 받음)
			}

			System.out.println("22"); // 실행됨(if 영향 안받음)
			// 영향받는 실행 코드가 1개여도 {} 중괄호로 감싸기

			System.out.println("======");

			// 실수로 제어문의 () 괄호 다음에 ;을 붙이는 경우가 많으니 조심할 것			
			if (false)
				;
			{
				System.out.println("11");
				System.out.println("22");
				System.out.println("33");
			}
		}

	}

}

// {} 중괄호 블록은 여러 개의 코드를 묶어주는 역할을 한다.
// 코드 실행 흐름에는 영향을 주지 않는다.