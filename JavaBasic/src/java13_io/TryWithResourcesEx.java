package java13_io;

import java.io.OutputStream;

public class TryWithResourcesEx {

	public static void main(String[] args) {
		
		// 출력할 데이터
		byte[] buf = "AppleBananaCherry".getBytes();
		
		try (OutputStream os = System.out){
			os.write(buf, 0, buf.length); // 데이터 출력
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


// try - with - resources 구문
// 예외처리 구문
// try-catch 구문

// jdk 1.7 추가

// -> 입출력 스트림 객체를 사용할때 finally 블록을 이용한 .close 호출을 예외 처리 구문이 자동으로 대신 처리한다

//try (객체 생성){ // 나중에 .close()를 수행해야 하는 객체
//	
//} catch (예외 객체 변수) {
//	
//}

// try 블록이 끝날때 자동으로 .close() 메소드를 호출해준다
// -> AutoCloseable interface를 상속받아야 가능하다
