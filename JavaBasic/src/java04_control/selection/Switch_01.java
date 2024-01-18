package java04_control.selection;

public class Switch_01 {

	public static void main(String[] args) {
		
		int num = 10;
		
		switch(num) {
		
		case 10:
			System.out.println("10");
			break;
			
		case 20:
			System.out.println("20");
			break;
			
		case 30:
			System.out.println("30");
			break;
			
		default:
			System.out.println("10, 20, 30 모두 아님");
		}
	}

}

// switch문, 선택문, 조건문
// switch - case문

// 비교대상과 같은 값으로 지정한 case구문의 취치부터 아래쪽 코드를 전부 실행한다.
// case의 값들 중 같은 값이 없으면 default부터 실행
// default: 부분은 생략 가능

//		switch(비교 대상) {
//		
//		case 비교값1 :
//			
//		case 비교값2 :
//			
//		case 비교값3 :
//			
//		default:
//			
//		}
