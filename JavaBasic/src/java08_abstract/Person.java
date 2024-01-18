package java08_abstract;

// 추상 클래스
public abstract class Person {

	protected String name;

	public Person(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	public abstract void display();
	
}
