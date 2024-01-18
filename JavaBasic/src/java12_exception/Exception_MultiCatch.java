package java12_exception;

public class Exception_MultiCatch {

	public static void main(String[] args) {

		try {
			// try 블록
			// 예외 발생이 예측되는 코드를 작성한다
		} catch (NullPointerException e) {
			// NullPointerException 예외 발생 시 예외 처리할 코드를 작성한다
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException 예외 발생 시 예외 처리할 코드를 작성한다
		} catch (Exception e) {
			// NullPointerException
			// ArrayIndexOutOfBoundsException
			
			// 둘 모두 아닌 나머지 모든 예외 발생 시 예외 처리할 코드를 작성한다
		}		
		
		// Multi Catch 구문
		// -> 하나의 Catch 구문에 여러 개의 예외 클래스를 적용하는 것
		try {
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			
		} catch (Exception e) {
			
		}

	}

}
