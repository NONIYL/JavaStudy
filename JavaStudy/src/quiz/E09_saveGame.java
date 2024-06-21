package quiz;

import java.util.Scanner;

public class E09_saveGame {
/*
 	# 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후 
 	  프로그램 종료시 여태까지의 게임 전적을 파일에 저장해주세요
 	  
 	  프로그램 실행시에는 파일에 저장되어있는 전적 데이터를 읽어 예전 기록이 
 	  계속해서 이어지도록 만들어 보세요
 	  
 	  경우: 가위 바위 보 , 비긴경우 , 이긴경우, 진경우
 	  
 */
	
public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	System.out.print("가위/바위/보 중 내고싶은걸 골라주세요: \t");
	String user = sc.nextLine();
	System.out.println("플레이어 " + user);

	String computer;
	int ran = ((int)(Math.random()) * 3);


	if (ran == 0) {
		computer = "가위";
	} else if (ran == 1) {
		computer = "바위";
	} else if (ran == 2) {
		computer = "보";
	} else {
		computer = "다시 입력해주세요";
	}
	System.out.println("컴퓨터 " + computer);

	if (user.equals("가위")) {
		if (computer.equals("보")) {
			System.out.println("=> 당신이 이겼습니다.");
			return;
		} else if (computer.equals("바위")) {
			System.out.println("=> 당신이 졌습니다.");
			return;
		} else {
			System.out.println("=> 비겼습니다.");
			return;
		}
	}
	if (user.equals("바위")) {
		if (computer.equals("가위")) {
			System.out.println("=> 당신이 이겼습니다.");
			return;
		} else if (computer.equals("보")) {
			System.out.println("=> 당신이 졌습니다.");
			return;
		} else {
			System.out.println("=> 비겼습니다.");
			return;
		}
	}
	if (user.equals("보")) {
		if (computer.equals("바위")) {
			System.out.println("=> 당신이 이겼습니다.");
			return;
		} else if (computer.equals("가위")) {
			System.out.println("=> 당신이 졌습니다.");
			return;
		} else {
			System.out.println("=> 비겼습니다.");
			return;
		}

	}
}
}








