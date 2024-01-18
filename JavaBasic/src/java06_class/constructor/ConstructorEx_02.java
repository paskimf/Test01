package java06_class.constructor;

class Constructor_02 {

	// 멤버 필드
	private int n1;
	private int n2;
	
	// this 키워드
	// -> 자기 참조 객체
	// -> 클래스 코드에서 멤버 필드나 멤버 메소드를 지칭할때 사용
	// -> 같은 클래스의 다른 멤버를 참조할 수 있게됨
	
	// this() 생성자 호출
	// -> 같은 클래스의 다른 생성자를 호출하는 코드
	// -> 반드시 생성자의 첫번째 코드로 작성되어야 함

	// 모든 멤버필드를 초기화하는 매개변수가 있는 생성자
	// -> 단축키: alt + shift + s, o, enter
	public Constructor_02(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// 생성자 오버로딩
	public Constructor_02(int n1) {
//		this.n1 = n1;
//		this.n1 = 0;
		
		this(n1, 0);
	}
	
	// 디폴트 생성자
	// -> 단축기: ctrl + space
	public Constructor_02() {
		
		this(0, 0);
		
//		n1 = 0;
//		n2 = 0;
	}

	// 모든 멤버 필드의 값을 출력하는 일반 메소드
	public void out() {
		System.out.println("n1: " + n1 + ", n2: " + n2);
	}

}

public class ConstructorEx_02 {

	public static void main(String[] args) {
		
		Constructor_02 cons01 = new  Constructor_02(111, 222);
		cons01.out();
		
		System.out.println("===============");
		
		Constructor_02 cons02 = new  Constructor_02(333);
		cons02.out();
		
		System.out.println("===============");
		
		Constructor_02 cons03 = new  Constructor_02();
		cons03.out();
		
	}

}
