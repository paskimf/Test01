package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_List01 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// empty list
		ArrayList<Object> list = new ArrayList();

		// [] ( == empty)
		System.out.println(list);

		System.out.println("============ 데이터 삽입 =============");

		// .add()를 실행한 순서대로 인덱스를 부여받는다 (0부터 시작)
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");

		System.out.println(list);

		System.out.println("============ 데이터 조회 =============");

		System.out.println("1번째 요소: " + list.get(1));
		System.out.println("리스트의 크기: " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째: " + list.get(i));
		}

		System.out.println("=========================");

		for (Object item : list) {
			System.out.println(item);
		}

		System.out.println("============ 데이터 수정 =============");

		list.set(0, "aaa");
		System.out.println(list);

		System.out.println("============ 데이터 삭제 =============");

		// .remove(int index) 인덱스로 요소를 지정하여 삭제
		// .remove(Object o) 요소의 값을 비교(equals)하여 삭제

		list.remove(1);
		System.out.println(list);

		list.remove("AAA");
		System.out.println(list);

		list.remove("CCC");
		System.out.println(list);

		System.out.println("============ isEmpty =============");

		System.out.println("list.isEmpty(): " + list.isEmpty());

		ArrayList l1 = null; // 리스트 캑체를 생성하지 않음
		ArrayList l2 = new ArrayList(); // 리스트 객체를 생성했지만 비어있음

		System.out.println("l1: " + l1);
		System.out.println("l2: " + l2);

		// l1.isEmpty(); 에러 NullPointerException
		System.out.println(l1 == null);

		l2.isEmpty();
		System.out.println(l2 == null);

		if (l2 != null) {
			if (!l2.isEmpty()) {
				System.out.println(l2.get(0));
			}
		}

		System.out.println("============ clear =============");

		list.clear(); // 모든 요소 제거
		System.out.println(list);

		System.out.println("=========================");

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		List list2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(list2);

		List list3 = Arrays.asList("AAA", "BBB", "CCC");
		System.out.println(list3);

		// List -> Array 변환
		Object[] arr2 = list2.toArray();
		Object[] arr3 = list3.toArray();

	}

}

// 삽입, 조회, 수정, 삭제
// 데이터를 다룰때 고려해야할 기능

// CRUD

// Create - 추가/삽입/생
// Read - 조회
// Update - 수정
// Delete - 삭제
