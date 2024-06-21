package quiz;

public class B07_forQuiz2 {

	/*
	 
	 1. 0 3 6 9 12 ... 93 96 99
	 2. -35 -28 -21 ... 0 7 14 ... 35
	 3. 100 200 300 ... 800 900 1000
	 4. 100 99 98 ... 5 4 3 2 1 0
	 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ...(30번)
	 6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
	 7. 7 77 777 7777 7777 .... 777777777
	 
	
	
	public static void main(String[] args) {

		// 1. 0 3 6 9 12 ... 93 96 99	
		
		for(int num = 0; num <= 99; ++num) {
			System.out.printf("%d ", num);	
		}
		
		System.out.print("---------------\n");
		
			
		//  2. -35 -28 -21 ... 0 7 14 ... 35

		for ( int i = -35; i <= 35; i += 7) {
			System.out.printf("%d ", i);
		}	
		System.out.println();
	
//		3. 100 200 300 ... 800 900 1000
		
		for (int num = 100; num <= 1000; ++num) {
			if (num % 100 == 0) {
			System.out.printf("%d ", num);	
			}
		}
		System.out.print("---------------\n");
		
//		 4. 100 99 98 ... 5 4 3 2 1 0
		
		for (int a = 100; a > -1; --a) {
			System.out.printf("%d ", a);	
		}
		System.out.print("---------------\n");	
		
//		 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ...(30번)
		
		for (int bb = 0; bb < 9; bb++) {
			for (int b = 0; b < 9; b++) {
				System.out.printf("%d ", b);
	
		}}
		System.out.print("---------------\n");	
		
		
//		6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
		
		for(int cc = 3; cc > 1; --cc) {
			for (int c = 10; c > 0; --c) {
				System.out.printf("%d ", c);
				
			}
		}
		System.out.print("---------------\n");	
		
//		 7. 7 77 777 7777 7777 .... 777777777
		
		for(int)
		
		 */
	
	public static void main(String[] args) {
		
		
	
//		 1. 0 3 6 9 12 ... 93 96 99
		// for문 내부에서 선언한 변수는 for문의 {}가 끝나면 사라진다
		for (int i = 0; i <= 99; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//	 2. -35 -28 -21 ... 0 7 14 ... 35
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//	 3. 100 200 300 ... 800 900 1000		
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	//	 4. 100 99 98 ... 5 4 3 2 1 0
		
		for (int i = 100; i >= 0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	//	 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ...(30번)
		
		for (int i = 0; i < 30; ++i) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();
		
		
	//	6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
		
		for (int i = 0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " ");
		}
		System.out.println();
		
	//	7. 7 77 777 7777 7777 .... 777777777 두 가지 방법
		
		// 결과가 너무 커서 int로 하면 -가 나온다 (오버플로우)
		int num = 7;
		
		// 10번 반복하고 싶으니까 0부터 10미만까지 반복한다 (0~9니까 10번이다)
		for (int i = 0; i < 10; ++i) {
			System.out.print(num + " ");
			num = num * 10 + 7;
		}
		System.out.println();
		
			
		String numStr = "";
		for (int i = 0; i < 10; ++i) {
			numStr += "7";
			System.out.print(numStr + " ");
		}
		System.out.println();
		
		
	
		
	}
	
	
}
