package java06_class.method;

// 일반 클래스
public class Method_01 {

	public void hello() {
		System.out.println("hello");
	}

	// 0. 메소드 기본 형태 작성
	public int substract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	// 1. 메소드 이름 정하기 - 만들려는 기능을 대표하는 단어로 이름을 정한다 - 이름: substract
	// 2. 매개변수 작성 - 기능 수행에 필요한 데이터(값)을 저장할 수 있도록 변수 선언하기 - 변수: int num1, int num2
	// 3. 실행 코드 작성 - 메소드의 기능을 구현한다 - num1, num2
	// 4. return 코드 작성 - 기능을 수행하는 결과값을 반환해야할때 작성한다 - return 결과값;
	// 5. return 타입 작성 - return 코드에 맞는 자료형을 작성한다 - int

	// 뺄셈 기능
	// -> 2개의 정수 값을 뺄셈하고 반환하는 기능을 구현한다

}

//[접근 제한자] [메소드 제한자] [리턴타입] 메소드명 ([매개변수]) {
//	실행 코드
//}