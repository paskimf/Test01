package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_Iterator {

	public static void main(String[] args) {

		List<Object> list = Arrays.asList("A", "B", "C", "D", "E");
		System.out.println(list);
		
		System.out.println("===================================");

		// 반복자 변수 선언
		Iterator<Object> iter = null;

		// list 객체를 이용하여 Iterator 객체 생성
		iter = list.iterator();

		// 요소가 존재하는 만큼 하나씩 반복
		while (iter.hasNext()) {
			
			// 요소를 반환하고 다음 요소를 참조하도록 만든다
			Object data = iter.next();
			
			System.out.println(data);
			
		}
		
		System.out.println("===================================");
		
		// 요소의 길이만큼 인덱스를 이용하여 반복
		for (int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			System.out.println(data);
		}
		
		System.out.println("===================================");
		
		// for-each 구문을 이용한 반복
		for(Object data : list) {
			System.out.println(data);
		}

	}

}

// interface Iterator
// 반복자
// 컬렉션의 모든 요소들을 순차(반복)적으로 접근할 때 사용한다

// Iterable 인터페이스를 상속받은 클래스의 .iterator() 메소드를 호출하면 Iterator 객체를 얻을 수 있다

// Iterator의 주요 메소드

// public E next()
//		다음 요소의 데이터를 반환한다
// public boolean hasNext()
//		다음 요소가 존재하는지 확인한다
