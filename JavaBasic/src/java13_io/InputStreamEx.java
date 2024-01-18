package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		// 키보드 표쥰 입력 스트림 객체
		InputStream is = System.in;

		// System.out.print("Input: ");

//		try {			
//			// 키보드 입력 완료는 엔터키를 누른다
//			// 엔터키는 '\r', '\n'으로 전달된다
//			// -> ASCII 13, ASCII 10
//			System.out.println(is.read());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 입력 데이터 저장소
		// -> read() 메소드의 매개변수로 사용
		// byte[] buf = new byte[10];
		byte[] buf = new byte[1024];

		// 입력된 데이터의 길이
		// -> read() 메소드의 반환값을 저장
		// -> read() 메소드의 반환값이 -1일 경우 스트림의 끝(EOF)에 도달한 것
		int len = -1;

		// 입력한 전체 데이터를 문자열로 저장하는 객체
		StringBuilder sb = new StringBuilder();

		// 입력한 전체 문자열의 길이
		int total = 0;

		System.out.println("<<입력 대기 중>>");

		try {
			// 입력 받을 데이터가 스트림에 남아있으면 반복해서 입력한다
			// -> 한번 입력에 buf 배열의 크기만틈 수행한다
			// -> EOF(입력 데이터의 끝)을 만날 때까지 입력을 반복한다
			while ((len = is.read(buf)) != -1) {
				// 키보드 스트림의 EOF 입력
				// ctrl + z

				// System.out.println(Arrays.toString(buf));
				// System.out.println(new String(buf, 0, len));

				// read()가 입력받은 전체 문자열을 StringBuilder에 반복해서 추가한다
				sb.append(new String(buf, 0, len));

				// read()가 입력받은 전체 문자열의 길이를 계산한다(총합)
				total += len;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 스트림 닫기
				// -> 스트림이 사용하던 시스템 자원을 반환한다
				// -> 자원 해제 코드
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("==========================");
		System.out.println("<<전체 입력 받은 데이터>>");
		System.out.println(sb);

		System.out.println("전체 입력 받은 길이");
		System.out.println(total + "B");

	}

}
