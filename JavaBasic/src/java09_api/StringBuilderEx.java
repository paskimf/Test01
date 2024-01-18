package java09_api;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		StringBuilder sb;
		
		// 에러, String처럼 사용 불가
		// sb = "AAA";
		
		// 객체 생성
		sb = new StringBuilder();
		
		System.out.println("length: " + sb.length()); // 길이
		System.out.println("capcity: " + sb.capacity()); // 용량
		
		System.out.println("========== Apple 추가 ===========");
		
		sb.append("AAA");		
		sb.append(123);
		sb.append(true);
		
		System.out.println(sb);
		
		System.out.println("length: " + sb.length()); // 길이
		System.out.println("capcity: " + sb.capacity()); // 용량
		
		System.out.println("===========================");
		
		sb.append("BananaBananaBananaBananaBanana");
		
		System.out.println(sb);
		
		System.out.println("length: " + sb.length()); // 길이
		System.out.println("capcity: " + sb.capacity()); // 용량
		
		System.out.println("===========================");
		
		// capacity를 length에 맞춤
		sb.trimToSize();
		
		System.out.println("length: " + sb.length()); // 길이
		System.out.println("capcity: " + sb.capacity()); // 용량

	}

}
