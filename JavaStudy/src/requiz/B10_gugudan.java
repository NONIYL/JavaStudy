package requiz;

public class B10_gugudan {
	
	
	/*
		1. 구구단을 다음과 같이 가로로 출력해보세요
		
		2단: 2x1=2 2x2=4
		3단: 3x1=3 3x2=6
		
		2. 구구단을 다음과 같이 세로로 출력해보세요
		
		2단      3단
		2x1=2    3x1=3
		2x2=4    3x2=6
    */
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; ++i) {
			System.out.printf("%d단: ", i);
			for(int j = 1; j <= 9; ++j) {
				System.out.printf("\t%dx%d=%d", i,j, i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int gop = 0; gop <=9; ++gop) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) {
					System.out.printf("%d단\t", dan);
				} else {
					System.out.printf("%dx%d=%d\t", dan, gop, gop * dan);
				}
			}
			System.out.println();
		}
		
	}

}
