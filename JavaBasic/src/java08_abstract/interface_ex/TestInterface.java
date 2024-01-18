package java08_abstract.interface_ex;

public interface TestInterface {

	public static final int NUM1 = 123;
	
	// public static final 키워드를 생략해도 모든 키워드를 자동으로 붙여서 선언된다
	// 인터페이스에 필드를 선언할때 public static final 키워드를 모두 붙여서 작성하는것이 좋다 
	int NUM2 = 333;
	public int NUM3= 222;
	static int NUM4= 111;
	public static int NUM5= 909;
	
	// ㅔㅇ러, abstract 키워드 없이도 추상 메소드로 적용된다
	// -> 추상 메소드는 {} 중괄호가 없어야 한다
//	public void method() {
//		
//	}
	
	public void out();
	
	public abstract void display();

}

// 인터페이스
// 상수 멤버 필드
// 추상 멤버 메소드

// 상수 멤버 필드
// -> public, static, final 키워드가 붙은 필드만 선언 가능하다

// 선언과 동시에 초기화 필수
