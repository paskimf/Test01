package java06_class.constructor;

public class ClassVariable_01 {

	// 멤버 필드
	private int num = 999;
	private String name;

	// 멤버 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 디폴트 생성자
	public ClassVariable_01() {
		name = "홍길동";
	}

}
