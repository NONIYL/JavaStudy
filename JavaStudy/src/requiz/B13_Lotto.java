package requiz;

import java.util.Arrays;

public class B13_Lotto {

	/*
	 * 
	 * (1) 1~45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 로또 당첨 번호 배열을 만들어 보세요
	 * 
	 * 1. 숫자를 랜덤으로 뽑는다 2. 이전에 뽑았던 숫자중에 방금 뽑은 숫자가 없는지 확인한다 3. 있으면 다시뽑고 없으면 넘어간다.
	 * 
	 * (2) 1등 또는 2등에 당첨될때까지 랜덤 로또 번호를 계속 생성하여 몇 번 만에 당첨되었는지 출력해보세요
	 * 
	 * -로또 구매자는 번호를 6개 고른다 -보너스 번호를 제외하고 모두 맞추면 1등 -보너스 번호를 포함하여 모두 맞추면 2등
	 * 
	 */

	public static void main(String[] args) {
		
		//1.로또 당첨 번호 배열 생성 
		// 당첨 번호를 저장할 배열 7개 생성
		int[] winNum = new int[7];
		
		//2. 당첨번호를 세기 위한 변수 
		// 현재까지 채워진 당첨 번호 인덱스를 나타냄
		int currIndex = 0;
		
		//3. 중복없는 랜덤 숫자 7개를 생성하는 반복문으로 7이 채워질때까지 반복 
		while (currIndex < winNum.length) {
			//4. 1~45 사이의 랜덤 숫자를 생성
			// 0~44사이의 랜덤 정수를 생성하고 +1 하여 1~45 범위로 만듦 
			int num = (int) (Math.random() * 45 + 1);
			//5. 이전에 뽑았던 숫자 중, 중복되는 숫자가 있는지 확인하는 과정
			// repeat = 중복 여부를 저장하는 변수 (초기값: 중복없음)
			boolean repeat = false;
			//현재까지 채워진 인덱스까지 반복
			for (int i = 0; i < currIndex; ++i) {
				//뽑은 숫자가 이전에 뽑았던 숫자와 같으면 
				if (winNum[i] == num) {
					//중복 발생
					repeat = true;
					//반복문 종료
					break;
				}
			}
			//6. 중복되지 않으면 당첨 번호 배열에 추가
			//중복되지 않았으면
			if (!repeat) {
				//당첨 번호 배열에 숫자 추가
				winNum[currIndex] = num;
				//++카운트
				++currIndex;

			}
		}
		//7. 로또 구매 횟수 저장하는 변수
		int buyCnt = 0;
		
		//8. 1등 또는 2등에 당첨될 때까지 반복 
		while (true) {
			
			//9. 로또 구매 횟수 증가
			++buyCnt;

			//10. 구매자의 로또 번호 배열 생성(6개)
			int[] seconWin = new int[6];
			//현재까지 채워진 구매자 번호 인덱스를 나타냄 
			currIndex = 0;

			//11. 구매자의 로또 번호를 생성하는 반복문
			// 6개 숫자가 채워질때까지 반복
			while (currIndex < seconWin.length) {
				//12. 1~45 랜덤 숫자 생성
				int num = (int) (Math.random() * 45 + 1);
				
				//13. 이전에 뽑았던 숫자 중에 중복되는 숫자가 있는지 확인
				boolean repeat = false;
				for (int i = 0; i < currIndex; ++i) {
					if (seconWin[i] == num) {
						repeat = true;
						break;
					}
				}
				//14. 중복되지 않으면 구매자 번호 배열에 추가
				if (!repeat) {
					seconWin[currIndex] = num;
					++currIndex;
				}
			}
			//15. 당첨 여부 확인을 위한 변수 초기화
			//당첨된 숫자 개수
			int winCnt = 0;
			//보너스 번호 당첨 여부
			boolean bonus = false;
			//16. 당첨 번호와 구매자 번호 비교하여 당첨 여부 확인
			// 당첨 번호 배열 순회
			for (int i = 0; i < winNum.length; ++i) {
				//구매자 번호 배열 순회
				for (int j = 0; j < seconWin.length; ++j) {
					//당첨 번호와 구매자 번호 
					if (winNum[i] == seconWin[j]) {
						++winCnt;
						//보너스번호 6번째 숫자가 맞으면
						if (j == 6) {
							//보너스 번호 당첨 여부 true
							bonus = true;
						}
						//내부 반복 종료
						break;

					}
				}
			}
			//17. 당첨 여부에 따라 출력
			//숫자 6개가 모두 일치한가
			if (winCnt == 6) {
				System.out.printf("%s vs %s\n", 
						Arrays.toString(winNum), Arrays.toString(seconWin));

				System.out.println(buyCnt + "회 구매만에 ");

				if (bonus) {
					System.out.println("2등 당첨입니다!");
					break;
				} else {
					System.out.println("1등 당첨입니다!");
					break;
				}

			}

		}

	}

}
