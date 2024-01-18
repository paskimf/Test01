package java09_api;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		Random ran;

		ran = new Random();

		System.out.println(ran.nextInt());

		System.out.println("======================");

		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextDouble()); // 0.0(포함) ~ 1.0(미포함)

		System.out.println("======================");

		System.out.println(ran.nextInt(100)); // 0 ~ 99 중 랜덤
		System.out.println(ran.nextInt(100) + 1); // 1 ~ 100 중 랜덤

		for (int i = 0; i < 10; i++) {

			switch (ran.nextInt(3)) {

			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
				break;
			}
		}

	}

}
