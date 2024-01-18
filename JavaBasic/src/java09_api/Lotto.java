package java09_api;

import java.util.Random;

public class Lotto {

	// 랜덤 객체
	private Random ran = new Random();

	public void makeLotto(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {

			// 번호 랜덤 추출
			int num = ran.nextInt(45) + 1;

			// 중복 값 제거
			boolean isExist = false;

			for (int j = 0; j < i; j++) { // 이전에 생성했던 랜덤 숫자들 반복
				if (lotto[j] == num) { // 중복된 값이 이미 존재할 경우
					isExist = true;
				}
			}

			// 중복 값 발견
			if (isExist) {
				i--; // 반복횟수 한번 추가하기
				continue;
			}

			// 랜덤값 배열에 대입
			lotto[i] = num;

		}

	}

	public void makeLotto2(int[][] lotto2) {

		for (int i = 0; i < lotto2.length; i++) {

			this.makeLotto(lotto2[i]);

		}
	}

}

// 로또 번호 생성기
// 1~45 범위 랜덤
// 6개 자리
// 중복되지 않기