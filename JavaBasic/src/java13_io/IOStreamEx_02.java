package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamEx_02 {

	public static void main(String[] args) {

		// 키보드 입력 스트림 -> 프로그램 -> 모니터 출력 스트림

		InputStream is = System.in; // 표준 입력 스트림 - 키보드
		OutputStream os = System.out; // 표준 출력 스트림 - 모니터(콘솔)

		byte[] buf = new byte[1024]; // 입출력 데이터의 임시 저장소
		int len = -1; // 입력 데이터의 길이

		try (InputStream is1 = System.in; OutputStream os1 = System.out;) {
			// 입력 데이터가 EOF가 될때까지 반복적으로 입력한다
			while ((len = is1.read(buf)) != -1) {

				// 입력 받는 데이터를 출력한다
				os1.write(buf, 0, len);

				// 출력 버퍼 비우기
				os1.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
