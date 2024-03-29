package java06_class;

// 실행 클래스
// 메인 메소드를 정의하고 있는 클래스
// 프로그램을 실행할 수 있는 클래스
public class Main_01 {

	public static void main(String[] args) {
		
		// Class_01 타입의 참조형 변수인 c01 선언
		Class_01 c01;
		
		// Class_01 타입의 인스턴스를 생성한다(new 연산자 이용)
		// 인스턴스의 참조값을 c01 변수에 대입한다
		c01 = new Class_01();
		
		// 멤버 필드의 이용
		c01.num = 123;
		c01.data = "Apple";
		
		// 멤버 메소드의 이용
		
		// 메소드 호출(call)
		c01.display();
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		
		c02.num = 222;
		c03.num = 333;
		c04.num = 444;
		
		// 객체 변수를 출력하면 참조값이 출력됨
		System.out.println(c04);
		
		Class_01 c05 = null;
		c05.data = "Banana"; // NullPointerException 예외 발생
		
	}

}

// NullPointerException
// -> null 값을 참조하여 코드를 실행하려고 했을때 발생하는 예외
// -> .(참조 연산자)를 찾아서 그 왼쪽에 있는 코드를 확인한다
// -> null 값을 가지고 있을 것이다
// -> . 연산자가 없으면 null 값을 불러오는 부분을 찾는다