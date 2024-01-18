package java06_class.method;

public class Method_02 {

	// 매개변수 | 없음 - ()괄호 비우기
	// 반환 데이터 | 없음 - void 타입으로 변경
	public void method01() {
		System.out.println("hello");
	}

	// 매개변수 | int parameter - int형 1개
	// 반환 데이터 | 없음 - void
	public void method02(int parameter) {
		System.out.println("전달된 값: " + parameter);
	}

	// 매개변수 | 없음 - int형 1개
	// 반환 데이터 | double형 데이터
	public double method03() {
		return 123.23;
		// return 1231; 정상, return 타입인 double로 자동 형변환
	}
	
	// 매개변수 | double d, int n - 2개
	// 변환 데이터 | 'A' - char형
	public char method4(double d, int n) {
		return 'A';
	}

}

// 매개변수(Parameter)
// -> 메소드의 () 괄호 안에 선언된 변수
// -> 호출될 때 입력(전달)된 데이터를 저장한다

// 전달인자(Argument)
// -> 메소드를 호출하며 ()괄호 안에 작성한 데이터
// -> 호출과 함께 전달되며 매개변수에 저장됨

// 반환 데이터(Return Data)
// -> 메소드의 기능이 종료되며 되돌려주는 값

// 반환 데이터 타입을 void가 아닌 타입으로 명시하면 반드시 return코드를 작성해야 한다