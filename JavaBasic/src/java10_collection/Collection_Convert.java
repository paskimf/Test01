package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_Convert {

	public static void main(String[] args) {

		List list = Arrays.asList("AAA", "BBB", "CCC", "BBB", "CCC");

		System.out.println(list);

		System.out.println("=======================");

		Set set = new HashSet(list);
		System.out.println(set);

		System.out.println("=======================");

		List list2 = new LinkedList(set);
		System.out.println(list2);

		list2.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return ((String) o1).compareTo((String) o2);
			}
		});
		
		System.out.println("=======================");
		
		System.out.println(list2);

	}

}
