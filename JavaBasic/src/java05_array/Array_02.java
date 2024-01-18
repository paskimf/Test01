package java05_array;

public class Array_02 {

	public static void main(String[] args) {

		int[] arr1; // 배열 변수 선언
		arr1 = new int[7]; // 배열 요소 생성

		// int[] arr2 = new int[13];
		String[] arr2 = new String[13];

		for (int i = 0; i < 13; i++) {
			// 모든 요소가 기본값 0으로 초기화 되어있음
			System.out.println(i + "index: " + arr2[i]);
		}

		System.out.println("============");

		// 선언과 동시에 초기화
		int num = 100;

		// 배열 요소를 생성하고 동시에 초기화시키기
		int[] arr3 = { 1, 2, 3, 4, 5 };
		
		char[] chaArr = {'A', 'p', 'p', 'l', 'e'};
		
		double[] dArr = {1.1, 2.2, 3.3, 4};
		
		boolean[] bArr = {true, true, false};
		
		// 에러, 배열 초기화는 배열을 선언할 때에만 사용할 수 있음
		// arr3 = {100, 200};
		
//		arr3 = new int[5];
//		arr3[0] = 1;
//		arr3[1] = 2;
//		arr3[2] = 3;
//		arr3[3] = 4;
//		arr3[4] = 5;

	}

}

// 데이터 타입들의 기본값
// 정수 - 0
// 실수 - 0.0
// 논리 - false
// 문자 - '\0' (null 문자)

// 참조 - null
