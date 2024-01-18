package java07_inherit;

class Parent {
	
	String name;
	int age;

	public void display() {
		System.out.println("부모 클래스 메소드");
	}
}

class Child extends Parent {
	int score;
	
	public void print() {
		System.out.println("자식 클래스 메소드");
	}

	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
	
	public void display(int num) {
		System.out.println("오버라이딩당한 메소드를 오버로딩한 메소드");
	}
	
}

public class InheritEx_01 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.name = "홍길동";
		p.age = 10;
		
		p.display();
		
		System.out.println("=================");
		
		Child c = new Child();
		
		// 상속받은 필드
		c.name = "심청이";
		c.age = 5;
		
		// 상속받은 메소드 -> 상속받아 재정의한 메소드
		c.display();
		
		// 상속받지 않은 필드
		c.score = 111;
		
		// 상속받지 않은 메소드
		c.print();
	}

}

// 오버라이딩, Overriding
// 메소드 재정의
// 상속받은 메소드의 기능을 재정의 하는것
// -> 부모 클래스에 정의된 리턴타입, 이름, 매개변수 형식과 같아야함

// @Override 어노테이션
// 오버라이딩 규칙이 잘 지켜졌는지 유효성 검사를 한다
// 상속받은 메소드에 적용한다
// 오버라이딩 문법에 맞지 않으면 문법 에러가 발생한다

// 어노테이션, Annotation
// 코드에 부가적인 기능, 의미 등을 부여할 때 사용한다
// @(at) 기호와 함께 다양한 키워드를 붙여서 사용한다
// 특정 동작, 문법, 코드 등을 간단히 적용할 수 있도록 되어있다
// @Override, @Deprecate, @Controller, @Service, @Target, @Aspcet, ...
