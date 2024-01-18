package java11_generic;

class Class02_int {

	public int data;

	public int display(int data) {
		this.data = data;
		return data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}

class Class02_double {

	public double data;

	public double display(double data) {
		this.data = data;
		return data;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

}

// 제네릭 클래스
class Class02<TYPE> {

	public TYPE data;

	public TYPE display(TYPE data) {
		this.data = data;
		return data;
	}

	public TYPE getData() {
		return data;
	}

	public void setData(TYPE data) {
		this.data = data;
	}

}

public class Generic_Class {

	public static void main(String[] args) {

		// 타입 파라미터를 결정하지 않음
		// -> Object 타입으로 자동 결정
		// -> raw type
		Class02 c01 = new Class02();

		c01.setData(111);

		int num = (int) c01.getData();

		Class02<String> c02 = new Class02<>();

		c02.setData("apple");
		String fruit = c02.getData();
		System.out.println(fruit);

	}

}
