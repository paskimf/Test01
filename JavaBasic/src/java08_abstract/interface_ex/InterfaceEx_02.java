package java08_abstract.interface_ex;

import java.util.Iterator;

import java08_abstract.interface_ex.mutiple.Child;
import java08_abstract.interface_ex.mutiple.Inter_01;
import java08_abstract.interface_ex.mutiple.Inter_02;
import java08_abstract.interface_ex.mutiple.Parent;

public class InterfaceEx_02 {

	public static void main(String[] args) {

		Child c = new Child();
		c.out();

		System.out.println("==================");

		Parent p = new Parent();
		p.out();

		System.out.println("==================");

		Parent pc = new Child();
		pc.out(); // 동적 바인딩 -> 자식 클래스의 메소드가 호출된다

		System.out.println("==================");

		Inter_01 i01;
		i01 = new Child();

		i01.out(); // 동적 바인딩

		System.out.println("==================");

		Inter_02 i02 = new Child();
		i02.out(); // 동적 바인딩

		System.out.println("==================");

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("==================");

		// for each 구문
		for (int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("==================");

		Child[] childs = new Child[10];

		for (int i = 0; i < childs.length; i++)
			childs[i] = new Child();

		for (Child ch : childs) {
			ch = new Child();
		}

		for (Child ch : childs) {
			ch.out();
		}

	}

}

// extends 클래스, implements 인터페이스 모두 부모 데이터 타입으로 사용된다
