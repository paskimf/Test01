package java12_exception;

public class Exception_TryCatch {

	public static void main(String[] args) {

		int[] arr = new int[5];

		int i = 0;

		try {

			while (true) {

				// 예외 발생 지점
				arr[i] = i + 1;
				i++;

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외 상황 출력(Method Call Stack Trace 출력)
			// e.printStackTrace();

			// 표준 에러 스트림 - 빨간 글자로 출력
			// System.err.println("인덱스 범위 벗어남");

			System.out.println("인덱스 범위 벗어남");
		} finally {
			System.out.println("예외 처리 이후 무조건 출력");
		}

	}
}
