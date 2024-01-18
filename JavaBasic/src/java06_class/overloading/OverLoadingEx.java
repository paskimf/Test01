package java06_class.overloading;

public class OverLoadingEx {

	public static void main(String[] args) {

		OverLoading ol = new OverLoading();

		ol.display();

		System.out.println("========");

		// (44, 55)로 출력하게 하기
		ol.setX(44);
		ol.setY(55);

		ol.display();

		System.out.println("========");

		// x, y를 111, 222로 입력하고 출력
		ol.display(111, 222);

	}

}
