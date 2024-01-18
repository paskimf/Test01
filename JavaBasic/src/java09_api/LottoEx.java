package java09_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {

		int[] lotto = new int[6];

		Lotto l = new Lotto();
		l.makeLotto(lotto);

		Arrays.sort(lotto);

		System.out.println(Arrays.toString(lotto));

		System.out.println("====================");

		int[][] lotto2 = new int[5][6];

		l.makeLotto2(lotto2);

		for (int[] game : lotto2) {
			Arrays.sort(game);
		}
		
		for (int[] game : lotto2) {
			System.out.println(Arrays.toString(game));
		}

	}

}
