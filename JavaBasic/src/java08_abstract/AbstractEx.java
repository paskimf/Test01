package java08_abstract;

public class AbstractEx {

	public static void main(String[] args) {

		Professor pf = new Professor("홍길동", "컴퓨터");
		Student st = new Student("심청이", "자바");

		pf.display();
		st.display();

		System.out.println("==================");

		// 추상 클래스 타입 객체 변수 선언 가능
		Person p1;

		// 에러, 추상 클래스를 이용한 객체 생성(new) 불가
		// p1 = new Person("흥부");

		System.out.println("==================");

		Person p2 = new Person("콩쥐") {

			@Override
			public void display() {
				System.out.println("익명 클래스");
				System.out.println("Annonymus Inner Class");
			}

		};

		p2.display();

		System.out.println("==================");

		Person p3 = new Professor("zzz", "c++");
		Person p4 = new Student("mmm", "python");

		p3.display();
		p4.display();

	}

}
