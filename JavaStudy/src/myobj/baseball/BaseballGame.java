package myobj.baseball;

import java.util.Arrays;

public class BaseballGame {

	int[] ans = new int[4];
	int chance = 9;
	
	public BaseballGame() {
		
		genAns();
	}
	
	// 실행하면 새로운 정답으로 초기화되는 메소드
	void genAns() {
		for (int i = 0; i < ans.length; ++i) {
			ans[i] = (int)(Math.random() * 10);
			
			for (int j = 0; j < i; ++j) {
				if (ans[i] == ans[j]) {
					--i;
					break;
				}
			}
		}
	}
	
	public void printAnswer() {
		System.out.println("정답은 " + Arrays.toString(ans) + "입니다.");
	}
	
	public BaseballGameResult guessNumber(int[] guessNum) {
		int[] result = guessNumber(guessNum[0], guessNum[1], guessNum[2], guessNum[3]);
		return new BaseballGameResult(result[0], result[1]);
	}
	
	public int[] guessNumber(int a, int b, int c, int d) {
		int[] result = {0, 0};
		
		for (int i = 0; i < ans.length; ++i) {
			if (ans[i] == a) {
				if (i == 0) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if (ans[i] == b) {
				if (i == 1) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if (ans[i] == c) {
				if (i == 2) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if (ans[i] == d) {
				if (i == 3) {
					++result[0];
				} else {
					++result[1];
				}
			}
		}
		
		return result;
	}
	
	// chance라는 인스턴스 변수를 다른 클래스에서 함부로 수정하게 두기보다는 내가 정해놓은 방식으로만 움직일 수 있게 메소드에만 public을 달아두는 것이 좋다.
	public void minusChance() {
		--this.chance;
	}
	
	public int getChance() {
		return this.chance;
	}
}
