package java02_operator;

public class Binary_01 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 15; //피연산자
		int result; // 연산의 결과 값을 저장할 변수
		
		result = num1 + num2;
		
		System.out.println(result + "\n");
		
		
		
		// %: 나머지/modular/mod/모드 연산자
		// 나눗셈을 수행하고 그 나머지 결과값을 출력
		
		int num3 = 17, num4 = 3; //피연산자
		int result2; // 연산의 결과 값을 저장할 변수
		
		result2 = num3 + num4;
		result2 = num3 - num4;
		result2 = num3 * num4;
		result2 = num3 / num4;
		result2 = num3 % num4;
		
		System.out.println(num3 + num4);
		System.out.println(num3 - num4);
		System.out.println(num3 * num4);
		System.out.println(num3 / num4);
		System.out.println(num3 % num4 + "\n");
		
		System.out.println(15 / 6);
		System.out.println(15.0 / 6.0);
		System.out.println(15 / 6.0 + "\n");
		
		System.out.println((double)num3 / num4 + "\n");
		
		System.out.println((double)(num3 / num4));
		System.out.println((double)(17 / 3));
		System.out.println((double)5);
		System.out.println(5.0 + "\n");
		
		double dNum = 3.14;
		System.out.println((dNum / 2));
		
	}

}

// 이항 연산자 - 산출
// +, -, *, /, %

// 산술 연산은 반드시 피연산자들의 데이터 타입이 같아야 한다.
// 산술 연산의 결과 값도 피연사자와 같은 데이터 타입을 가진다.
