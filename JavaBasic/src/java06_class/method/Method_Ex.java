package java06_class.method;

// 실행 클래스
public class Method_Ex {

	public static void main(String[] args) {

		// 객체 생성
		Method_01 m01 = new Method_01();

		// 메소드 호출
		m01.hello();

		System.out.println("===============");

		int res = m01.substract(500, 600);
		System.out.println("뺄셈 결과: " + res);
		
		System.out.println("===============");
		
		System.out.println("뺄셈 결과: " + m01.substract(500, 200));
		
		System.out.println();
	}

}
