package java05_array;

public class Array_03 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 76, 412, 551 };

		// 배열의 길이/크기, 요소의 개수
		// -> 배열이름.length
		// ex) arr.length
		System.out.println("배열의 길이: " + arr.length);

		System.out.println("===============");

		// 배열의 모든 요소 출력 - for
		// 0 ~ arr.length-1
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
