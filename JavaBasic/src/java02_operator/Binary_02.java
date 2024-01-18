package java02_operator;

public class Binary_02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2;
		num2 = 22;
		
		
		int num3 = num1;
		
		// 대입연산자는 대입한 값을 연산식에 리턴함
		int num4, num5, num6;
		num6 = num5 = num4 = 33;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2 + "\n");
		
		// 왼쪽 항의 값을 오른쪽 항의 값과 덧셈한 후 왼쪽 항에 대입함
		// num2 = num2 + num1;
		num2 += num1;
		//num2 -= num1;
		//num2 *= num1;
		//num2 /= num1;
		//num2 %= num1;		
		
		
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		// 복합 연산자의 대입기호(=)는 한상 오른쪽에 위치함
		num2 = -22; // - 부호 변환 연산자(단항 연산자)
					// = 대입 연산자(이항 연산자)
		
		num2 -= 22; // -= 산술 복합대입연산자(이항 연산자)
		
	}

}

// 이항 연산자 - 대입
// =

// 오른쪽에 있는 값을 왼쪽에 있는 공간에 저장한다.
// 연산 방향이 오른쪽에서 왼쪽으로 진행됨

// 오른쪽에 있는 항은 값으로 사용할 수 있는 상수, 변수 연산 결과 등이 온다.
// 왼쪽 항은 공간으로 사용할 수 있는 변수가 옴

// 연산자 우선 순위가 최하위에 있음

// 복학 대입 연산자
// 다른 연산자와 대입 연산자를 함께 사용하는 연산자

// 산술 대입 연산자
// += -= *= /= %=

