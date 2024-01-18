package java03_scanner;

import java.util.Scanner;

public class Scanner_Quiz {

	public static void main(String[] args) {

		Scanner sc;

		sc = new Scanner(System.in);

		System.out.println(sc);

		System.out.println("=====입력=====");

		System.out.print("국어 입력: ");
		int kor = sc.nextInt();

		System.out.print("영어 입력: ");
		int eng = sc.nextInt();

		System.out.print("수학 입력: ");
		int math = sc.nextInt();

		int add = kor + eng + math;

		double avg = (kor + eng + math) / (double)3;

		System.out.println("국어: " + kor + " 영어: " + eng + " 수학: " + math + " 총점: " + add + " 평균: " + avg);

		sc.close();

	}

}

//3과목 점수 관리 프로그램

//   국어, 영어, 수학
//   점수를 저장할 수 있는 변수를 만들고
//   3과목 점수를 입력받는다

//   총점과 평균을 포함한 결과를 출력한다

//동작 예시)

//===== 입력 =====
//Input Korean : 100
//Input English : 99
//Input Mathematics : 97

//===== 출력 =====
//국어   영어   수학   총점   평균
//100     99     97     296   98.666666667
