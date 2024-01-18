package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_Properties {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		// .put() 메소드를 이용하면 Properties의 고유한 특성을 이용할 수 없다
		// prop.put(true, 123123);
		
		// .setProperty(), .getProperty()를 이용하여 문자열 타입의 key-value 쌍을 관리한다
		prop.setProperty("A", "100");
		
		System.out.println(prop.getProperty("A"));
		
		System.out.println("========================");
		
		prop.setProperty("id", "qwe");
		prop.setProperty("pass", "123");
		prop.setProperty("test", "data");
		
		System.out.println(prop);
		
		System.out.println("========================");
		
		// Properties 객체 -> File
		
		// 파일 출력 스트림 객체
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("C:/Users/user1/Desktop/eclipse-workspace/JavaBasic/src/java10_collection/user.properties");
			prop.store(writer, "command: User Information");
			
			// 스트림 닫기
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		// 파일 입력 스트림 객체
		FileReader reader = null;
		
		// 입력받은 데이터를 확인할 Properties 객체
		Properties test = new Properties();
		
		System.out.println("test: " + test);
		
		try {
			reader = new FileReader("C:/Users/user1/Desktop/eclipse-workspace/JavaBasic/src/java10_collection/user.properties");
			
			// 파일에서 데이터 입력받기
			test.load(reader);
			
			System.out.println("====== 불러온 후 ======");
			System.out.println("test: " + test);
			
			// 스트림 닫기
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("========================");
		
		// 자바 api에서 제공하는 기본 시스템 프로퍼티(속성)
		Properties sysProp = System.getProperties();
		
		System.out.println(sysProp);
		
		System.out.println("====== 자바 정보 ======");
		System.out.println(sysProp.getProperty("java.version"));
		System.out.println(sysProp.getProperty("java.vendor"));
		
		System.out.println("====== OS 정보 ======");
		System.out.println(sysProp.getProperty("os.name"));

	}

}
