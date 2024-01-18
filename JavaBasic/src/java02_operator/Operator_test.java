package java02_operator;

public class Operator_test {

	public static void main(String[] args) {

		int a = 5, b = 6, c = 10, d;

		d = ++a * b--;

		System.out.println("a=" + a + ", b=" + b + ", d=" + d + "\n");

		d = a++ + ++c - b--;

		System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
		
		System.out.println("--------------------------");

		int a1 = 5, b1 = 6, c1 = 10;

		boolean res1;
		res1 = a1 < b1 || --a1 > c1++;
		System.out.println("a1=" + a1 + ", b1=" + b1 + ", c1=" + c1 + "\n");

		boolean res2;
		res2 = c1 < b1++ && c1-- > ++a1;
		System.out.println("a1=" + a1 + ", b1=" + b1 + ", c1=" + c1);

	}

}

// 논리연산의 단축 수행
// and 연산자는 왼쪽 피연산자가 false라면 오른쪽항 연산을 수행하지 않는다.
// or연산은 왼쪽 피연산자가 true라면 오른쪽항 연산을 수행하지 않는다.