package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_Set {

	public static void main(String[] args) {

		// Set set = new HashSet(); // 기본 set
		// Set set = new LinkedHashSet(); // 입력 순서 유지 set
		Set set = new TreeSet(); // 정렬 set

		// 밑에 중복 데이터를 적을경우 중복 데이터는 제거된다
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.println(set);

		System.out.println("=========================");

		// Set 객체의 Iterator 생성
		Iterator iter = set.iterator();

		// Iterator를 통한 전체 데이터 출력
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("=========================");

		for (Object data : set) {
			System.out.println(data);
		}

		System.out.println("=========================");

		System.out.println("크기: " + set.size());
		System.out.println("공백: " + set.isEmpty());
		System.out.println("30 존재: " + set.contains(30));
		System.out.println("30 제거: " + set.remove(30));
		System.out.println("50 제거: " + set.remove(50));

		System.out.println(set);
		
		System.out.println("=========================");
		
		set.clear();
		
		System.out.println(set);

	}

}
