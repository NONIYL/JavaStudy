package quiz;

public class B10_Gugudan {
	
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

		//가로출력 n단: nxn=n
		for(int i = 2; i <= 9; ++i) {
			System.out.printf("%d단: ",i);
			for(int j = 1; j <= 9; ++j) {
				System.out.printf("\t%dx%d=%d",i, j, i * j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//새로출력 n단: nxn=n
		//gop = 0을 쓰는 이유: 가로와 다르게 세로 구구단 형태는 0 = 2단이 첫번째 자리이고
		//  0은 = 2단이 첫번째 자리이고, 1은 = 2x1=2의 자리이다
		// 그렇기 때문에 gop의 시작자리가 0이 아니면 2x2=4 부터 시작됨..
		for (int gop = 0; gop <= 9; ++gop) {
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
