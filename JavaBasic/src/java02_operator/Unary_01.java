package java02_operator;

public class Unary_01 {

	public static void main(String[] args) {

		int num1 = -7;
		int num2 = +7;
		
		System.out.println(num1);
		
		System.out.println(-num1);
		System.out.println(-(-7)); // 변수값 불러오기
		System.out.println(7); // 부호 변환

	}

}

// 단항 연산자 - 부호, sign
// +, -

// ! - 논리 부정 연산자
// (type) - 형변환 연산자
// . - 참조 연산자

// 비트단위 논리 연산자
// ~ - 비트 not(단항)
// ^ - 비트 aor(이항)
// & - 비트 and(이항)
// | - 비트 or(이항)

// 비트단위 shift 연산자
// <<
// >>
// >>>