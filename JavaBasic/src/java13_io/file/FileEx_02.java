package java13_io.file;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		
		// 절대 경로 지정 - Absolute Path
		File file1 = new File("C:\\Users\\user1\\Desktop\\eclipse-workspace\\JavaBasic\\src\\java13_io\\file\\", "Hello");
		
		System.out.println(file1.exists());
		System.out.println(file1.length());
		
		System.out.println("============================");
		
		// 상대 경로 지정
		File file2 = new File("src\\java13_io\\file\\", "Hello");
		
		System.out.println(file2);
		System.out.println(file2.exists());
		System.out.println(file2.length());
		
		System.out.println(file2.getAbsolutePath());
		
		System.out.println("============================");
		
		// 상대 경로 기준점 == 클레스 패스 == 프로젝트 폴
		// C:\\Users\\user1\\Desktop\\eclipse-workspace\\JavaBasic\\
		
//		File file3 = new File(".\\src\\java13_io\\file\\..\\..\\java10_collection\\", "user.properties");
//		System.out.println("user.properties: " + file3.exists());
		
		// File file3 = new File(".\\src\\java13_io\\file\\", "Hello");
		File file3 = new File("../JavaBasic/src/java13_io/file/", "Hello");
		System.out.println("Hello: " + file3.exists());

	}

}
