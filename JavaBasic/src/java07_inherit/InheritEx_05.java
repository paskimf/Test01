package java07_inherit;

class Parent05 {

	public void display() {
		System.out.println("부모 클래스");
	}
}

// final class Child05 extends Parent05 {
class Child05 extends Parent05 {

	@Override
	public final void display() {
		System.out.println("자식 클래스 오버라이딩");
	}
}

class GrandChild extends Child05 {

//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
}

public class InheritEx_05 {

	public static void main(String[] args) {

	}

}
