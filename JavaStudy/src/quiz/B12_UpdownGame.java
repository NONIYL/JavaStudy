package quiz;
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
    
 */


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int start, guess, Chance = 6, max = 101, min = 0, usertry = 0;
			
			start = (int)(Math.random() * 100) + 1;
			
			while (true) {
				if (usertry == Chance) {
					System.out.printf("모든 기회를 사용하셨습니다. 정답은 %d였습니다.\n", start);
					break;
				}
				
				System.out.print("숫자 입력: ");
				guess = sc.nextInt();
				
				if ( guess >= max || guess <= min) {
					System.out.printf("추측 범위를 벗어난 숫자입니다.\n현재 추측 범위는 %d 초과 %d 미만입니다. (남은 기회: %d)\n", min, max, Chance - usertry);
					continue;
				}
				
				++usertry;
				
				if (guess == start) {
					System.out.printf("%d번 만에 정답!\n", usertry);
					break;
				} else if (guess < start) {
					System.out.printf("Up! (남은 기회: %d)\n", Chance - usertry);
					min = guess;
				} else if (guess > start) {
					System.out.printf("Down! (남은 기회: %d)\n", Chance - usertry);
					max = guess;
				}
			}
		}

	}