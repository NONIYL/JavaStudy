package quiz;

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

		//(1)
		int[] scores = new int[100];
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int) (Math.random() * 101);
		}
		
		//(2)
//		for (int i = 0; i < scores.length; ++i) {
//			if (scores[i] < 60)
//	              System.out.print("X\t");
//		    } else {		
//		    System.out.print(score[i] + "\t");		
//			if ( i % 10 == 9) {
//				System.out.println();
//			}
//		}
		
		for (int i = 0; i < scores.length; ++i) {
			if (i % 10 == 0) {
				System.out.println();
			}
			if (scores[i] < 60) {
				System.out.printf("x점\t");
			} else {
				
			System.out.printf("%d점\t", scores[i]);
			}
			
		}
		
		
		int total = 0;
		for (int i =0; i < scores.length; ++i) {
			total += scores[i];
			
		}
		System.out.println();
		System.out.printf("평균점수: %.2f점\n", total / (double) scores.length);
		
		//4. 
		
		int maxScore = 0;
		int minScore = 100;
		// ※ 삼항연산자
		// - 조건 ? 예 : 아니요;
		// - ? 앞의 조건이 참일때는 :의 오른쪽 값을 선택
		// - ? 앞의 조건이 거짓일때는 :의 오른쪽 값을 선택
//		 for (int i =0; i < scores.length; ++i) {
//			maxScore = maxScore > scores[i] ? maxScore : scores[i];
//			minScore = minScore < scores[i] ? minScore : scores[i];
			
		
		for (int i =0; i < scores.length; ++i) {
			maxScore = Math.max(maxScore, scores[i]);
			minScore = Math.min(minScore, scores[i]);
						
			//현재 최고값과 i번째 값을 비교해서 i번째 값이 더 크면 최고값으로 변경한다
			if(maxScore < scores[i]) {
			   maxScore = scores[i];
			}
			//현재 최저값과 i번째 값을 비교해서 i번째 값이 더 작으면 최저값으로 변경한다
			if(minScore > scores[i]) {
			   minScore = scores[i];
			}
		
		}
		System.out.printf( "최고점수: %d, 최저점수: %d\n", maxScore, minScore);
	}
}	

//		
//		double avg = 0; 
//		int sum = 0;
//		
//		for(int i = 0; i < scores.length; ++i) {
//		 sum = sum + scores[i];
//		}
//		avg = sum/scores.length;
//		
//		System.out.printf("평균점수는 %.2f점 입니다.", avg);
//	
//	
//		for(int i = 0; i < scores.length; ++i) {
//			scores[i] = (int) (Math.random() * 101);
//			
//			int max = 0;
//			int min = 100;
//			
//			if(scores[i]> )
//			
//		
//		}
//	
	