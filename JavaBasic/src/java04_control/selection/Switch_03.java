package java04_control.selection;

public class Switch_03 {

	public static void main(String[] args) {

		// char형은 정수값(ascii)으로 처리
		// -> switch 비교대상으로 사용 가능
		char alpha = 'B';

		switch (alpha) {

		case 'A':
			System.out.println("A");
			break;

		case 'B':
			System.out.println("B");
			break;
		}

		System.out.println("==============");

		// String 타입을 switch구문에서 사용할 수 있음
		// -> jdk1.7 이상
		String str = "AAA";

		switch (str) {
		
		case "AAA":
			System.out.println("AAA");
			break;

		case "BBB":
			System.out.println("BBB");
			break;
		}
		
		System.out.println("==============");
		
		String str1 = "Cherry"; // 상수 활용
		String str2 = new String("Cherry"); // 객체 활용
		
		// ==로 String 비교하면 안됨
		System.out.println(str1 == str2); //false
		
		// .equals()를 이용하여 비교해야 함
		System.out.println(str1.equals(str2)); //true
		
		System.out.println("==============");
		
		if(str2.equals(str1)) {
			System.out.println("두 문자열이 같다");
		}

	}

}

//		에러
//		double d = 3.14;
//		boolean d = true;
//		
//		switch(d) {
//		
//		}
