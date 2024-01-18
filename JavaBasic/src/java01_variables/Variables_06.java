package java01_variables;

public class Variables_06 {

	public static void main(String[] args) {
		
		//한글 변수는 가능하지만 걍 하지말기
//		double 넓이 = 22.12;
//		
//		System.out.println(넓이);
		
		System.out.println(3456L);
		System.out.println(3456.123f);
		
		// 변수 상수화
		// 이름있는 상수의 식별값은 모든 글자를 대문자로 작성한다.
		final int wDay = 25;
		
		
		System.out.println("이번 달은 " + wDay + "일 근무");
		System.out.println("이번 달 급여: " + wDay * 150000 + "원");
		
	}

}
