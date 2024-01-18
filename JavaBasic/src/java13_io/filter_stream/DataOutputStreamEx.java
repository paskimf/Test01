package java13_io.filter_stream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {

	public static void main(String[] args) {

		// 출력 파일 객체
		File file = new File(".\\src\\java13_io\\filter_stream\\", "DataTest.txt");

		// 데이터 출력 스트림
		DataOutputStream dos = null;

		try {
			// Program -> DataOutputStream -> BufferedOutputStream -> FileOutputStream ->
			// FileInputStream
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

			// OutputStream의 기본 출력 메소드
			// -> 18 단위로 ASCII코드를 처리한다
//			dos.write(65); // 'A'
//			dos.write("Apple".getBytes());

			// DataOutputStream의 자료형 유지 출력 메소드
			dos.writeBoolean(false);
			dos.writeInt(123);
			dos.writeChar('A');

			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
