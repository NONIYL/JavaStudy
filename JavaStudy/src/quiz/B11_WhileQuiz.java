package quiz;

public class B11_WhileQuiz {

	/*
	 * while 문을 사용하여
	 * 
	 * 1. 1000 ~ 2000 사이의 13의 배수를 모두 출력
	 * 
	 * 2. 50부터 100 사이의 모든 숫자의 총합을 구해서 출력
	 * 
	 * 3. 1부터 1000사이의 모든 10배의 배수를 한 줄에 8개씩 출력
	 * 
	 * 4. 1부터 19까지 모든 숫자의 곱을 구해서 출력
	 * 
	 * 5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	 */

	public static void main(String[] args) {

		// 1. 1000 ~ 2000 사이의 13의 배수를 모두 출력
		System.out.println("========== 1번 ==========");
		int i = 1000;
		while (i <= 2000) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
			++i;
		}

		// 2. 50부터 100 사이의 모든 숫자의 총합을 구해서 출력
		System.out.println("========== 2번 ==========");
		i = 50;
		int sum = 0;
		while (i <= 100) {
			sum += i++;
		}
		System.out.println(sum);
		
		// 3. 1부터 1000사이의 모든 10배의 배수를 한 줄에 8개씩 출력
		System.out.println("========== 3번 ==========");
		i = 0;
		int cnt = 0;
		while (i++ < 1000) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
				if (++cnt % 8 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();

		// 4. 1부터 19까지 모든 숫자의 곱을 구해서 출력
		System.out.println("========== 4번 ==========");
		i = 0;
		sum = 1;
		while (i++ < 19) {
			sum *= i;
		}
		System.out.println(sum);

		// 5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
		System.out.println("========== 5번 ==========");
		i = 9000;
		cnt = 0;
		while (i-- > 4999) {
			if (i % 287 == 0) {
				if (++cnt == 5) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
