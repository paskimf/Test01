package java05_array;

import java.util.Scanner;

public class Array_Quiz02_v2 {

	public static void main(String[] args) {

		int[] arr = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };

		int[] invert_arr = new int[arr.length];

		// arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			// arr.length-1: 마지막 인덱스 번호
			invert_arr[arr.length - 1 - i] = arr[i];
			// System.out.println(invert_arr[i]);
		}

		for (int i = 0; i < invert_arr.length; i++) {

			// arr.length-1: 마지막 인덱스 번호
			invert_arr[arr.length - 1 - i] = arr[i];
			System.out.print(invert_arr[i] + " ");
		}

		System.out.println("\n==================");

		int[] arr1 = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };
		int result = 0;

		// 홀수 번째 요소들과 짝수 번째 요소들을 각각 합산
		for (int i = 0; i < arr1.length; i++) {

			if (i % 2 == 0) { // 짝수
				result += arr1[i];
			}

			else { // 홀수
				result -= arr1[i];
			}
		}

		System.out.println("결과: " + result);

	}
}
