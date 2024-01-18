package java12_exception;

class ThrowsTest {

	public void method1() throws RuntimeException {
		
		// Unchecked Exception
		throw new RuntimeException();
	}

	public void method2() throws Exception {
		
		// Checked Exception
		throw new Exception();
	}
}

public class Exception_Throws {

	public static void main(String[] args) {
		
		ThrowsTest tt = new ThrowsTest();
		
		// Unchecked 예외
		try {
			tt.method1();			
		} catch (Exception e) {
			System.out.println("Unchecked 예외 처리");
		}
		
		System.out.println("====================");
		
		try {
			tt.method2();
		} catch (Exception e) {
			System.out.println("Unchecked 예외 처리");
			// e.printStackTrace();
		}

	}

}

// throws 키워드
// 예외 처리 떠넘기기
// 예외 처리 미루기

// 예외가 발생한 메소드에서 직접 예외처리(try-catch)를 하지 않고 자신을 호출한 메소드(Caller)에게 예외 처리를 떠넘기는 키워드
// 예외가 발생한 상황에서 대한 책임을 Caller에게 묻는것
// -> 코드를 개발하는 사람이 try-catch를 적용해야만 한다
