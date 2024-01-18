package java02_operator;

public class Binary_04 {

	public static void main(String[] args) {

		boolean b1 = true;
		boolean b2 = false;

		System.out.println("true && false: " + (b1 && b2)); // false
		System.out.println("true || false: " + (b1 || b2) + "\n"); // true

		int num = 77;

		System.out.println(num >= 1);
		System.out.println(num <= 100);

//		System.out.println(1 <= num <= 100); 에러

		System.out.println(num >= 1 && num <= 100);		
				
		System.out.println(!(num >= 1 && num <= 100));
		
		System.out.println((num < 1 || num > 100));

	}

}

// 이항 연산자 - 논리
// &&	 ||		!
// and	 or		not

// !(not) 연산자는 단항 연산자

// 논리(boolean) 데이터의 관계를 따져서 결과를 반복함

// and 연산은 피연산자가 모두 true일 때 전체 결과가 true
// or 연산은 피연산자 둘 중 하나라도 true일 때 전체 결과가 true
// not 연산은 피연산자의 논리를 부정한다

// ** !(논리부정) 연산자의 적용
// 관계 연산자를 반대 조건으로 치환한다.
// 논리 연산자를 && -> ||, || -> &&로 치환한다.