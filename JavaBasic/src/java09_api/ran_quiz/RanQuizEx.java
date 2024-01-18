package java09_api.ran_quiz;

import java.util.Random;
import java.util.Scanner;

public class RanQuizEx {

	public static void main(String[] args) {

		Random ranQuiz = new Random();

		int com = ranQuiz.nextInt(50) + 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("=====게임 시작=====");

		System.out.print("숫자 입력: ");
		int num = sc.nextInt();

		int user;

		for (int i = 1; i <= 7; i++) {
			user = sc.nextInt();

			if (com < user) {
				System.out.println("down");
			}

			else if (com == user) {
				System.out.println("게임 끝");
			}

			else if (com > user) {
				System.out.println("up");
			}

		}

	}

}
