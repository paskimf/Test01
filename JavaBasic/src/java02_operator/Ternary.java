package java02_operator;

public class Ternary {

	public static void main(String[] args) {

		System.out.println((true) ? "참" : "거짓");
		System.out.println((false) ? "참" : "거짓");

		System.out.println("------------");

		int num1 = 10, num2 = 20;

		System.out.println(num1 < num2 ? "num1이 작다" : "num1이 작지 않다");
		
		System.out.println("------------");
		
		// num1, num2 두 숫자 중 큰 값을 저장
		// 같은 값은 그대로 반환한다.
		int res = num1 > num2 ? num1 : num2;
		
		System.out.println(res);

	}

}

// 삼항 연산자 - 조건
// 조건식 - 연산의 결과를 true/false로 판단할 수 있는 식
// ? :
// 조건식 ? 조건식이 true일때 반환 :조건식이 false일때 반환