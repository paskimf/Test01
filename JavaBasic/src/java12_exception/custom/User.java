package java12_exception.custom;

public class User {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {

		// 예외 상황으로 정의
		if (age < 0 || age > 150) {
//			System.out.println("0~150 사이로 나이 입력");
//			return;
			throw new UserAgeException();			
		}
		this.age = age;
	}

}
