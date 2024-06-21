package requiz;
import java.util.Scanner;
public class B12_UpdownGame {


	/*
	 	1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자가 정답이 된다
	 	2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다
	 	3. 만약 사용자가 현재 추측 범위를 벗어나는 숫자를 입력했다면
	 	   기회를 소진하지 않고 다시 입력할 수 있는 기회를 준다
	 	   
	 	   ex> 50
	 	       Down! (남은기회 4회)
	 	       75
	 	       추측 범위를 벗어난 숫자입니다...(남은기회 4회)
	 	       
	    4. 6번 안에 못 맞추면 정답이 뭐였는지 알려주고 프로그램을 종료한다
	    5. 사용자가 정답을 맞추면 축하한다고 해주고 프로그램을 종료한다
	    
	    //BEBUG_MODE => all대문자 변수 
		//프로그램 실행 내내 변경되지 않을 값
		//앞으로 변하지 않을 값 지정
		//boolean DEBUG_MODE = false;
	    
	 */
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자입력: ");
	
	int start, guess, chance = 6, min = 0, max = 100, userTry = 0;
	
	start = (int)(Math.random() * 100) + 1;
	
	while(true) {
		if (userTry == chance)
		System.out.printf("정답은 %d 입니다.", start);
		break;
	}
	
		guess = sc.nextInt();
		System.out.print(">> ");
		
		while(true) {
			if (guess > max || guess < min) {
				System.out.printf("범위를 벗어났습니다. %d ~ %d 안에서 다시 추측을 시도하세요 (남은 횟수 %d)"
						, min, max, chance - userTry );
				continue;
			}
	
			++userTry;
	
	
			if(start == chance) {
				System.out.printf("%d회 안에 정답을 맞추셨습니다", chance - userTry);
			} else if(start < chance) {
				System.out.printf("UP! (남은기회: %d)", chance - userTry);
			} else if(start > chance) {
				System.out.printf("down! (남은기회: %d)", chance - userTry);
			}
	
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}