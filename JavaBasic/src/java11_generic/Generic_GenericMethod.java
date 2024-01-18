package java11_generic;

// 일반 클래스
class Class03 {

	// 일반 메소드 - <T> 적용 - 제네릭 메소드
	public <T> void display(int num) {
		double dNum;
	}

	// 제네릭 메소드
	public <P> P out(P obj) {
		P data = obj;
		return data;
	}
}

public class Generic_GenericMethod {

	public static void main(String[] args) {

		// 일반 클래스 생성
		Class03 cl = new Class03();

		// 메소드 호출 시에는 전달 인자의 데이터 타입을 보고 타입 파라미터가 자동 결정된다
		cl.out(123);

		// 에러 T -> Double로 결정 후 호출
		// -> int타입을 Double 타입으로 표현 불가능
		// cl.<Double>out(1234);
		
		// Number는 Double과 Integer의 부모 클래스
		cl.<Number>out(1234);
		
		cl.<Boolean>out(true);

	}

}
