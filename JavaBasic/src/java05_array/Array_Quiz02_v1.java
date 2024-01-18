package java05_array;

import java.util.Scanner;

public class Array_Quiz02_v1 {

	public static void main(String[] args) {

		int[] arr = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };

		// arr = new int[10];

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("invert_arr: " + arr[i]);
		}

		System.out.println("============");

//		for (int i = 0; i <= 0; i++) {
//			// System.out.println((arr[0]+arr[2]+arr[4]+arr[6]+arr[8])-(arr[1]+arr[3]+arr[5]+arr[7]+arr[9]));
//
//		}

		int add1 = 0; // 짝수
		int add2 = 0; // 홀수

		// 홀수 번째 요소들과 짝수 번째 요소들을 각각 합산
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) { // 짝수
				add1 += arr[i];
			}

			else { // 홀수
				add2 += arr[i];
			}
		}

		System.out.println("짝수 번째 합: " + add1);
		System.out.println("홀수 번째 합: " + add2);
		System.out.println("두수의 차: " + (add1 - add2));

	}
}
