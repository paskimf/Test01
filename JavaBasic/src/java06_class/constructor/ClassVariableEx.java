package java06_class.constructor;

public class ClassVariableEx {

	public static void main(String[] args) {
		
		ClassVariable_01 cv01;
		cv01 = new ClassVariable_01();
		
		ClassVariable_01 cv02 = new ClassVariable_01();
		ClassVariable_01 cv03 = null;
		
		cv01.setNum(111);
		
		System.out.println(cv01.getNum());
		System.out.println(cv02.getNum());
		// System.out.println(cv03.getNum()); 예외 발생, NullPointException
		
		System.out.println("==============");
		
		ClassVariable_02 cv04 = new ClassVariable_02();
		ClassVariable_02 cv05 = new ClassVariable_02();
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		
		cv04.city = "Busan";
		
		System.out.println("==============");
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);		
		System.out.println(ClassVariable_02.city);
		
		System.out.println("==============");
		
		ClassVariable_02.city = "Suwon";
		System.out.println(ClassVariable_02.city);
		
		
		
	}

}

// 정적변수는 클래스 단위로 관리되기 때문에 정적인 방법(static way)으로 사용해야 한다