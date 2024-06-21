package requiz;

public class B07_forQuiz {
	
	/*
	  1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
	  
	  2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해보세요
	  
	  3. 1부터 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요
	  
	  4. 1부터 19까지 모든 숫자를 곱을 구해서 출력해보세요 
	  
	  5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	  
	 */

	public static void main(String[] args) {

		// 1
		for (int i = 1000; i <= 2000; ++i) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
		}
		// 2
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum += i;
			System.out.println(sum);
		}
		// 3
		for (int i = 1, cnt = 0; i <= 1000; ++i) {
			if (i % 10 == 0) {
				System.out.printf("%6d", i);
				++cnt;
				if (cnt % 8 == 0) {
					System.out.println();
				}

			}
		}
		System.out.println();

		// 4
		for (int i = 8999, cnt = 0; i >= 4999; i--) {
			if (i % 287 == 0) {
				++cnt;

				if (cnt == 5) {
					System.out.printf("5번째 배수: %d ", i);
				
				}
			}

		}
	}
}