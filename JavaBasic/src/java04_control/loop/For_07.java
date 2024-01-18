package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {

		int day;
		int money = 10;
		int total = 0;

		for (day = 1; day <= 15; day++) {
			total = total + money;
			money = money * 2;
		}

		System.out.println(total);

		System.out.println("====================");

		int total1 = 0;

		for (int day1 = 0, money1 = 10; day1 < 15; total1 += money1, money1 *= 2, day1++) {

		}

		System.out.println(total1);

	}

}

//Quiz.
//첫날에 10원을 예금하고,
//다음날에는 전날의 2배를
//예금하는 방식으로
//보름(15일) 동안 저축한 금액은?
// -> 327670
