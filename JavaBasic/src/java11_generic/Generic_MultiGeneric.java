package java11_generic;

// 멀티 제네릭 클래스
class Class04<T1, T2> {

	private T1 data1;
	private T2 data2;

	public <Q1, Q2> Q2 change(Q1 data) {
		Q2 result = (Q2) data;

		return result;
	}

	public T1 getData1() {
		return data1;
	}

	public void setData1(T1 data1) {
		this.data1 = data1;
	}

	public T2 getData2() {
		return data2;
	}

	public void setData2(T2 data2) {
		this.data2 = data2;
	}

}

public class Generic_MultiGeneric {

	public static void main(String[] args) {

		Class04<Integer, String> c01 = new Class04<>();

		int num1 = c01.change(2.11);
		int num2 = c01.<Double, Integer>change(2.11);
		
		// int[] arr = new int[100000000000];

	}

}
