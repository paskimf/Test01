package java05_array.array2d;

public class Array2D_01 {

	public static void main(String[] args) {

		// 2차원 배열
		int num; // int 변수 선언 -> 정수값 1개 저장
		int[] arr1D; // int형 배열 변수 선언 -> 정수값 여러개 지정
		
		int[][] arr2D; // int형 2차원 배열 변수 선언 -> int[] 여러개 저장
			// -> ((정수 값)의 여러개 묶음)을 한번 더 여러개로 포장한것
		
		int[][][] arr3D;
		int[][][][] arr4D;
		int[][][][][] arr5D;
		
		int[] testArr = new int[9];	 // int형 9개	
		int[][] data = new int[3][4]; // int형 4개씩 3묶음(뒤쪽부터 파악하기)
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성 - new 연산자
		arr = new int[3][2]; // 3행 2열 크기의 int형 변수 공간이 생성된다
		
		// 1행 0열 인덱스 요소에 55555 대입
		arr[1][0] = 55555;
		
		System.out.println(arr[1][0]);
		
		int[] a1; // 추천
		int a2[];
		
		int[][] a3; // 추천
		int a4[][];
		int[] a5[];
				
				
		
	}

}
