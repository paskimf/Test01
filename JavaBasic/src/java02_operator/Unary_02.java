package java02_operator;

public class Unary_02 {

	public static void main(String[] args) {

		int num;

		num = 15;
		num++; // num 변수에 저장된 값을 1 증가시킴

		System.out.println(num);

		++num; // num 변수에 저장된 값을 1 증가시킴

		System.out.println(num);

		System.out.println("--------------");

		num = 15;
		System.out.println(num);
		System.out.println(num--); // 감소연산자 적용, 후치/후위 감소
		System.out.println(num);

		System.out.println("--------------");

		num = 15;
		System.out.println(num);
		System.out.println(--num); // 감소연산자 적용, 전치/전위 감소
		System.out.println(num);

		System.out.println("--------------");

		num = 13;
		System.out.println(num++ - 10 - ++num);
		

	}

}

// 단항 연산자 - 증감

// ++ - 증가 연산자
// -- - 감소 연산자

// 피연산자로 적용한 변수에 저장된 값을 1증가/감소 시킨다.

// 증감 연산자는 다른 연산식과 같이 사용할 때 계산법이 달라진다.
// -> 변수의 앞에 적용했는지 뒤에 적용했는지에 따라 달라짐

// 전위 증감연산은 변수의 값을 불러오기 전에 증/감한다.
// 후위 증감연산은 변수의 값을 불러온 후에 증/감한다.