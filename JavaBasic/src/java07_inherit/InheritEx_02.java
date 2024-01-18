package java07_inherit;

class Parent02 {

	public int num;

	public void display() {
		System.out.println("부모 메소드");
	}
}

class Child02 extends Parent02 {

	public String name; // 자식 클래스의 고유 멤버

	public void print() { // 자식 클래스의 고유 멤버
		System.out.println("자식 고유 메소드");
	}

	// 상속받은 멤버 필드
	public int num;

	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
}

public class InheritEx_02 {

	public static void main(String[] args) {

		Child02 c = new Child02();

		c.num = 123; // 고유멤버 num에 대입 - Child02

		((Parent02) c).num = 111; // 상속받은 num에 대입 - Parent02

		Parent02 p = new Parent02();
		p.num = 999;

		p.display();
		c.display();

		System.out.println("================");

		// 자바에서는 클래스 타입의 형변환이 금지되어 있다
		// 단, 자식 클래스를 부모 클래스 타입으로만 형변환 할 수 있다
		// -> 자동형변환 된다

		// Parent02 <- Child02 형변환

		Parent02 pc = new Child02();

		pc.num = 555;

		((Child02) pc).num = 12442;

		System.out.println("================");

		// 동적바인딩 - 인스턴스의 타입인 child02의 display() 메소드를 실행한다
		pc.display();

		// 에러, Parent02 타입에 print() 메소드가 존재하지 않는다
		// -> 컴파일 타임을 넘기지 못한다
		// -> 문법 에러
		// pc.print();
		
		((Child02) pc).print();
		
		System.out.println("================");
		
		Parent02 p02 = new Parent02();
		
		// 예외 발생, 부모 타입을 자식 타입으로 사용 불가능
		// ((Child02)p02).display();
		
		// 예외 발생, 부모 타입을 자식 타입으로 형변환을 할 수 없다
//		Child02 c02 = (Child02) new Parent02();		
//		c2.num123;

	}

}

// 자식 클래스를 부모 클래스 타입으로 자동 형변환 할 수 있다
// 부모 타입 객체 변수에 자식 타입 인스턴스를 저장할 수 있다
// 부모 타입 객체를 자식 인스턴스 타입으로 강제 형변환 할 수 있다.

// ClassCastException 예외
// -> 특정 클래스를 다른 클래스로 사용(형변환)하려고 시도할 때 발생한다
// -> 부모타입을 자식타입으로 사용할 때도 예외가 발생한다
// -> 실행 해보기 전에는 예외 발생을 확인할 수 없으므로 사전에 조심할 것 (문법 에러는 아님)
