package java13_io.filter_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) {

		// 입력 대상 파일
		File file = new File(".\\src\\java13_io\\filter_stream", "Source.txt");
		System.out.println("file exists: " + file.exists());

		// 파일 입력 스트림 객체
		FileInputStream fis = null; // 1차 스트림 - 파일 입력
		BufferedInputStream bis = null; // - 2차 스트림 - 성능 향상

		// 파일 입력 관련 변수
		byte[] buf = new byte[1024];
		int len = -1;

		try {
			
			// 파일 입력 스트림 생성
			fis = new FileInputStream(file); // 1차 - File 객체 -> FileInputStream
			bis = new BufferedInputStream(fis); // 2차 - FileInputStream -> BufferedInputStream
			
			// 2차
			bis = new BufferedInputStream(new FileInputStream(file));

			// 파일 입력
			while ((len = bis.read(buf)) != -1) {
				// System.out.print(new String(buf, 0, len));
				System.out.write(buf, 0, len);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 보조 스트림 객체를 .close()하면 연결된 1차 스트림을 .close()한다
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
