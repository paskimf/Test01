package java05_array.array2d;

import java.util.Scanner;

public class Array2D_04_v2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int stu_num = 2; // 학생 수
		final int subject_num = 2; // 과목 수
		final String[] subject = {"국", "영", "수"};

		int[][] score = new int[2][3];
		int[] sum = new int[2];
		double[] avg = new double[2];

		// 2명에 대한 3과목 점수 입력
		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i+1) + "번 학생 " + subject[j] + "의 점수: ");
				score[i][j] = sc.nextInt();
			}
			
			System.out.println();

		}

		// 총점 계산
		for (int i = 0; i < stu_num; i++) {
			//for(int j = 0; j < score.length; j++) {
			for(int j = 0; j < subject_num; j++) {
				sum[i] = score[i][0] + score[i][1] + score[i][2];				
			}
		}

		// 평균 계산
		for (int i = 0; i < stu_num; i++) {
			avg[i] = sum[i] / (double)subject_num;
		}

		// 출력
		System.out.print(" 번호 | 국어 | 영어 | 수학 | 총점 | 평균");

		for (int i = 0; i < stu_num; i++) {
			System.out.print("\n" + (i + 1) + "번 "); // 번호
//			System.out.print(score[i][0]); // 국어
//			System.out.print(score[i][1]); // 영어
//			System.out.print(score[i][2]); // 수학

			// 학생의 과목 점수 개수만큼 반복
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			
			// 총점
			System.out.print(sum[i] + " ");
			
			//평균
			// System.out.print(avg[i] + " ");
			// System.out.print(String.format("%.2f", avg[i]));
			System.out.printf("%.2f", avg[i]);
		}
	}

}

//QUIZ.
//   2명의 국어, 영어, 수학 점수를 처리하기
//   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 

//   ** 2차원배열 이용해보기

//   int[2][3] - 학생들 점수
//   int[2] - 학생들 총점
//   double[2] - 학생들 평균

//----- 최종 출력 -----
//   번호   국어   영어   수학   총점   평균
//   1번      xxx      xxx      xxx      xxx      xxx.xx
//   2번      xxx      xxx      xxx      xxx      xxx.xx
