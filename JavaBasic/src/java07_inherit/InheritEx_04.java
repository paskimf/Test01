package java07_inherit;

class Parent04 {

	protected int num;

	public Parent04() {

		// this 생성자 호출 코드, 같은 클래스의 다른 생성자를 호출한다
		this(0);

		System.out.println("부모 디폴트 생성자");

		// 매개변수 있는 생성자를 호출하여 초기화 코드를 대신할 수 있다
		// -> this(0);
		// this.num = 0;
	}

	public Parent04(int num) {

		System.out.println("부모 매개변수가 있는 생성자");

		this.num = num;

	}
}

class Child04 extends Parent04 {

	public Child04() {

		// 부모 생성자 호출 코드, super 생성자 호출
		// -> 자식 클래스의 생성자에서 부모 생성자를 호출할 때 사용한다
		// -> 생략해도 자식 클래스는 항상 부모 생성자를 호출(super;)하도록 되어있다

		super();

		System.out.println("자식 디폴트 생성자");
	}

	public Child04(int num) {

		// 자식 클래스는 기본적으로 항상 부모 디폴트 생성자를 호출한다
		// 부모 디폴트 생성자를 호출한다 - 기본
		// super();

		// 부모 매개변수 있는 생성자를 호출한다 - 선택
		super(num);
		
		System.out.println("자식 매개변수가 있는 생성자");

		// 상속받은 num 필드 초기화
		// super.num = num;
		
		// 에러 안남, Child04에 num 필드가 없어서 super 영역에서 찾는다
		this.num = num;


	}

}

public class InheritEx_04 {

	public static void main(String[] args) {

		// 디폴트 생성자 호출
		Parent04 p1 = new Parent04();

		System.out.println("=================");

		// 매개변수 있는 생성자 호출
		Parent04 p2 = new Parent04(222);

		System.out.println("=================");

		// 자식 디폴트 생성자 호출
		Child04 c1 = new Child04();

		System.out.println("=================");

		Child04 c2 = new Child04(333);

	}
}
