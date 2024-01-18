package java09_api;

public class WrapperEx {

	public static void main(String[] args) {

		// int형 변수 (기본형)
		int num = 10;

		// Deprecated
		// -> 더 이상 사용하면 안되는 표시
		// -> Wrapper 생성자들은 모두 deprecated 되었음
		// Integer ival1 = new Integer(num);
		// Integer ival2 = new Integer("123");

		// Integer형 변수(참조형)
		Integer ival1 = 11111;
		// Integer ival2 = "22222";
		Integer ival2 = num;

		int i1 = ival1;
		int i2 = ival2;

		// 자료형에 대한 정보
		System.out.println("BYTES: " + Integer.BYTES);
		System.out.println("SIZE: " + Integer.SIZE);
		System.out.println("Double BYTES: " + Double.BYTES);
		System.out.println("Boolean TRUE: " + Boolean.TRUE);
		System.out.println("Boolean FALSE: " + Boolean.FALSE);

		System.out.println("=====================");

		System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
		System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE: " + Long.MIN_VALUE);
		System.out.println("MAX_VALUE: " + Long.MAX_VALUE);

		System.out.println("=====================");

		// parse - 추출하다
		// 일정 패턴을 이용하여 원하는 형식의 데이터를 추출한다
		// 기본형 <- 문자열(Wrapper.parseType(String))
		int number = Integer.parseInt("111");
		double dNum = Double.parseDouble("1111.2222");
		boolean bData = Boolean.parseBoolean("false");
		
		// 문자열 <- 기본형(String.valueOf(data))
		String iStr = String.valueOf(1234);
		String bStr = String.valueOf(true);

	}

}
