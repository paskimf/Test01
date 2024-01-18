package java05_array.sort;

import java.util.Arrays;

public class BubbleSort_v2 {

	public static void main(String[] args) {

		// 버블 정렬
		int[] arr = { 3, 2, 5, 4, 1 };

		// 원본 출력
		System.out.println("=== 정렬 전 ===");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// 버블 정렬 수행
		for (int j = 0; j < arr.length - 1; j++) {

			// 각 회차 반복
			for (int i = 0; i < arr.length - 1 - j; i++) { // i, 0 ~ arr.length-2

				// if (arr[i] > arr[i + 1]) { // 오름차순
				if (arr[i] < arr[i + 1]) { // 내림차순

					// 스왑 - 인접한 요소를 비교하고 왼쪽이 크면 스왑
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}

			}

		}

		// 결과 출력
		System.out.println("=== 정렬 후 ===");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}

		System.out.println("\n===================");

		int[] arr2 = { 123, 5234, 4363, 23452, 21, 568 };
		
		// 정렬
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));

	}
}
