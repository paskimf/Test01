package java13_io.file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx02 {

	public static void main(String[] args) {

		// 입력 대상 파일 객체
		File fileIn = new File(".\\src\\java13_io\\filestream", "Source.txt");
		// System.out.println("exists: " + fileIn.exists());

		// 파일 입력 관련 변수
		byte[] buf = new byte[1024]; // 입력 데이터 저장소
		int len = -1; // 입력 데이터의 길이

		// 최종 데이터 저장소
		StringBuilder sb = new StringBuilder();

		// 파일 입력 스트림 객체
		FileInputStream fis = null;

		try {
			// 파일 입력 스트림 생성
			fis = new FileInputStream(fileIn);

			// 파일에 읽어들일 데이터가 존재하면 반복한다
			while ((len = fis.read(buf)) != -1) {
				sb.append(new String(buf, 0, len));
			}
		} catch (FileNotFoundException e) {
			// FileInputStream의 생성자
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 스트림 닫기
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

//		System.out.println();
//		System.out.println("<<읽어들인 파일의 데이터>>");
//		System.out.println("\t" + sb);

		// 출력 대상 파일
		File fileOut = new File(".\\src\\java13_io\\filestream", "Destination.txt");
		System.out.println("exists: " + fileOut.exists());

		// 파일 출력 스트림 객체
		FileOutputStream fos = null;

		try {

			// 파일 출력 스트림 객체
			// -> 출력 대상 파일이 존재하지 않으면 파일을 생성한다
			fos = new FileOutputStream(fileOut);
			// fos = new FileOutputStream(file, true); // 추가 모드
			// fos = new FileOutputStream(file, false); // 쓰기 모드

			// 파일 출력
			File data = fileIn;
			fos.write(sb.toString().getBytes(), 0, sb.length());
			fos.flush();

			if (fileOut.exists()) {
				System.out.println("파일 복사 성공");
			}

			else {
				System.out.println("파일 복사 실패");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				// 스트림 닫기
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
