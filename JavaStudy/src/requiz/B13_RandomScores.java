package requiz;

import java.util.Random;

public class B13_RandomScores {
	

	/*
	 	1. 100개의 점수를 랜덤으로 생성하여 배열에 저장
	 	(점수는 0 ~ 100점)
	 	
	 	2. 배열에 저장된 값을 한 줄에 10개씩 출력
	 	(단, 60점 미만인 점수는 x로 표시)
	 	
	 	3. 모든 점수의 평균 점수를 출력 (소수 둘째 자리까지 출력)
	 	
	 	4. 생성된 랜덤 점수 중 가장 높은 점수와 가장 낮은 점수를 출력
	 */

	
	public static void main(String[] args) {
		 
	Random ran = new Random();
	
	//1. 100개의 점수를 랜덤으로 생성하여 배열에 저장
	
	int[] score = new int[100];
	
	for(int i = 0; i < score.length; ++i) {
		score[i] = (int)(Math.random() * 101);		
	}

	//2. 배열에 저장된 값을 한 줄에 10개씩 출력	(단, 60점 미만인 점수는 x로 표시)
	
	for(int i = 0; i < score.length; ++i) {
		if (i % 10 == 0) {
			System.out.println();
		} else if (score[i] < 60) {
			System.out.print("x점\t");
		} else {
			System.out.printf("%d점\t", score[i]);
		}
	}
	
	//3. 모든 점수의 평균 점수를 출력 (소수 둘째 자리까지 출력)
	int tatal = 0;
	for (int i = 0; i < score.length; ++i) {
		tatal += score[i];
	}
	
	
	//4. 생성된 랜덤 점수 중 가장 높은 점수와 가장 낮은 점수를 출력
	
	int max = 0;
	int min = 100;
	
	for (int i = 0; i < score.length; ++i) {
		max = Math.max(max, score[i]);
		min = Math.min(min, score[i]);
		
		if(max < score[i]) {
			max = score[i];
		}
		if(min > score[i]) {
			min = score[i];
		}
	}
	System.out.printf("최고점수: %d, 최저점수: %d\n", max, min);
	}
}