package java06_class.getset;

public class GetSetEx {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		// 에러, 외부 객체의 접근이 막혀있음(private)
		// data.num = 23432;
		
		// Setter 호출을 통해 멤버필드의 값 불러오기
		data.setNum(22);
		
		// Getter 호출을 통해 멤버필드의 값 불러오기
		System.out.println(data.getNum());
		
		data.getName();
		data.getPhone();
		
		data.setName("홍길동");
		data.setPhone("010-1111-1111");

	}

}
