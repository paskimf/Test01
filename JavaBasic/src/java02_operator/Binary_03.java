package java02_operator;

public class Binary_03 {

	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("num1 == num2: " + (num1 == num2));
		System.out.println("num1 != num2: " + (num1 != num2));
		System.out.println("num1 <= num2: " + (num1 <= num2));
		System.out.println("num1 >= num2: " + (num1 >= num2));
		System.out.println("num1 < num2: " + (num1 < num2));
		System.out.println("num1 > num2: " + (num1 > num2) + "\n");
		
		boolean result = num1 == num2;
		
		System.out.println("결과: " + result);
		
	}

}

// 이항 연산자 - 관계, 비교

// <
// >
// <=
// >=
// ==
// !=

// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 피교한다.
// 비교 연산 결과를 참/거짓으로 반환한다.
// -> boolean 타입을 리턴함
// -> true / false