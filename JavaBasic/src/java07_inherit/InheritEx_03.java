package java07_inherit;

class Parent03 {

	// private int num = 111;
	protected int num = 111; // protected 접근 제한자: 같은 패캐지 + 상속된 자식

	public Parent03() {
		System.out.println("부모 디폴트 생성자");
		System.out.println(num);
	}

}

class Child03 extends Parent03 {

	private int num = 333;

	public Child03() {
		// num = 222;

		System.out.println("자식 디폴트 생성자");
		System.out.println("this.num: " + this.num); // 자식 멤버필드 num
		System.out.println("super.num: " + super.num); // 부모 멤버필드 num

	}
}

public class InheritEx_03 {

	public static void main(String[] args) {

		Parent03 p = new Parent03();

		System.out.println("==============");

		Child03 c = new Child03();

	}

}

// 자식 인스턴스를 생성할 때 부모 생성자 호출, 자식 생성자 호출
// 둘 모두 수행한다
