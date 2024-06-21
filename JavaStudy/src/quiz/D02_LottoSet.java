package quiz;

import java.util.HashSet;

public class D02_LottoSet {

	/*
	 * HashSet을 사용해 1~45 사이의 중복없는 7개의 랜덤 숫자를 생성해보세요
	 */

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<>();

//		for(int i = 1; i <= 45; ++i) {
//			num.add((int)(Math.random() * 45));

		int[] numbers = new int[7];
		int ii = 0;

		while (ii < 7) {
			num.add((int) (Math.random() * 45 + 1));
			boolean a = false;
			for (int i = 0; i < ii; ++i) {
				if (numbers[i] == 0) {
					a = true;
					break;
				}

			}

		}
	}
}
