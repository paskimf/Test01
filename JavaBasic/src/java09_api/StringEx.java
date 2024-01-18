package java09_api;

public class StringEx {

	public static void main(String[] args) {

		String str1 = "apple"; // 리터널 상수
		String str2 = new String("banana");

		System.out.println("========== length() ==========");

		System.out.println("str1의 길이: " + str1.length());
		System.out.println("str2의 길이: " + str2.length());
		System.out.println("\"car\"의 길이: " + "car".length());

		System.out.println("====================");

		// str1을 소문자로 변경
		System.out.println(str1.toLowerCase());

		// str2를 대문자로 변경
		System.out.println(str2.toUpperCase());

		// str1의 3번째 글자 추출
		System.out.println(str1.charAt(3));

		// str2의 n을 a로 변경
		System.out.println(str2.replace('n', 'a'));

		// str1의 특정 문자 확인
		System.out.println(str1.contains("a"));

		System.out.println("========== substring() ==========");

		// 문자열의 일부를 출력한다
		System.out.println(str1.substring(2));
		System.out.println(str2.substring(1, 3));

	}

}
