package java05_array;

public class Array_01 {

	public static void main(String[] args) {

		int num; // int형 변수 선언
		num = 123; // int값 대입

		// int형 배열 타입의 변수를 선언한다.
		int[] arr;

		arr = new int[5];
		// int형 배열 공간 생성
		// int변수 공간 5개를 만들고 연결해놓는다
		// 생성된 전체 배열 공산의 첫 주소(참조값)을 반환한다
		// 반환된 주소(참조값)를 arr 배열 변수에 저장한다

		System.out.println("arr: " + arr);

		System.out.println("====================");

		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;

		// ArrayIndexOutOfBoundsException 예외 상황 발생
		// -> arr 배열의 길이(크기)가 5니까 인덱스 범위는 0~4이다
		// -> 인덱스를 5로 접근하면 여섯번째 공간을 찾는 것이다
		// -> 오류(예외)
		// arr[5] = 66;

		// 반복문을 이용하여 배열의 모든 값 대입 및 출력하기
		for (int i = 0; i < 5; i++) { // i, 0~4
			arr[i] = (i + 1) * 100;
			System.out.println(arr[i]);
		}

	}
}

// 배열 선언
// 배열 자라료형 배열명;

// 배열의 자료형 표현
// 자료형 []

// ex) int[] - int형 배열
// -> int형 변수를 여러개로 나열한 묶음을 만들어 관리한다.

// 배열을 생성할때 변수 공간이 묶음으로 한꺼번에 만들어진다
// -> int 단위로 구분된 공간 5개를 만들었음
// -> 첫번째 공간부터 0번째(인덱스)로 불림
