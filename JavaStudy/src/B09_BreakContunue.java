
public class B09_BreakContunue {

	/*
	  # break
	 
	 	-switch-case문 내부에서 사용하면 해당 case를 탈출한다 
	 	-반복문 내부에서 사용하면 해달 반복문을 탈출한다
	 
	 # continue
	 
	 	- 반복문 내부에서 continue를 만나면 즉시 다음번 반복으로 넘어간다
	  
	 */

	public static void main(String[] args) {

		for (int i = 0; i < 1000; ++i) {
			System.out.println(i); // 위치에 따라 결과가 다르다!!

			// i값이 323일때 break를 만나 반복문을 탈출한다
			if (i == 323) {
				break;
//				System.out.println(i); // 위치에 따라 결과가 다르다!!

			}
		}

		System.out.println("---------------------------------------------------------");
		
		// Ctrl + Shift + F : 자동 줄맞춤 
		for(int i = 0; i < 100; ++i) {
			if (i % 2 == 0) {
				continue; // i에 짝수가 있을때 컨티뉴를 만나 ++i로 올라감
			} 
			System.out.println(i);
		}
	}
}
