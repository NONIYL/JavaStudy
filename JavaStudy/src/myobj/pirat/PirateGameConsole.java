package myobj.pirat;

import java.util.Arrays;
import java.util.Scanner;

public class PirateGameConsole {

	Scanner sc = new Scanner(System.in);

	PigamePlayer[] players = new PigamePlayer[4];
	PigameR game = new PigameR();

	int turn = 0;
	boolean DEBUG_MODE = true;

	public PirateGameConsole() {
		players[0] = new PigamePlayer("유재석");
		players[1] = new PigamePlayer("강호동");
		players[2] = new PigamePlayer("마동석");
		players[3] = new PigamePlayer("이도현");

	}

	public void printAllPlayers() {
		players[0].print();
		players[1].print();
		players[2].print();
		players[3].print();
	}

	public PigamePlayer[] getOrderedPlayers() {
		// 플레이어들을 복사한 배열을 하나 준비해서 정렬한다(원본을 해치지 않기 위함)
		PigamePlayer[] copied = Arrays.copyOf(players, players.length);

		// 플레이어들의 점수를 기준으로 순서를 재배치 한다
		for (int i = 0; i < copied.length; ++i) {
			// 점점 줄어들면서 확인함
			for (int j = 0; j < copied.length - 1 - i; ++j) {
				if (copied[j].rating < copied[j + 1].rating) {
					PigamePlayer temp = copied[j];
					copied[j] = copied[j + 1];
					copied[j + 1] = temp;

				}
			}
			PigamePlayer most = null;

			for (int j = 0; j < copied.length; ++j) {
				if (copied[j] != null) {
					if (most == null) {
						most = copied[j];
					} else {
						most = most.rating > copied[j].rating ? most : copied[j];
					}
				}
			}
		}

		return copied;
	}

	public void printEndInfo() {
		// 현재까지의 점수를 기준으로 순위를 매긴다
		// 점수 기준으로 순위가 정렬된 배열을 하나 생성한다
		// (점수가 같으면 앞에 있던 사람이 1등)
		PigamePlayer[] ordered = getOrderedPlayers();

		System.out.println("#### 최종 결과 ####");
		ordered[0].print(1000);
		ordered[1].print(500);
		ordered[2].print(-500);
		ordered[3].print(-1000);

	}

	public void start() {
		while (true) {
			int currPlayerIndex = turn % players.length;
			PigamePlayer currPlayer = players[currPlayerIndex];

			if (DEBUG_MODE) {
				game.showAnswer();
			}

			game.print();
			System.out.printf("[%d턴]\"%s\"님의 차례 > ", turn + 1, currPlayer.name);
			int userInput = sc.nextInt();

			if (userInput < 1 || userInput > 20) {
				System.out.println("[WAPNING] 1 ~ 20사이의 숫자만 입력해주세요!");
				continue;
			}
			int result = game.stab(userInput - 1);

			if (result == PigameR.STABBED_HOLE) {
				System.out.println("이미 찔렀던 곳은 다시 선택할 수 없습니다!!");
				continue;
			} else if (result == PigameR.SAFE_HOLE) {
				currPlayer.survive();
				++turn;
			} else if (result == PigameR.LAUNCH_HOLE) {
				System.out.println("통아저씨가 하늘 높이 날아갑니다...");
				System.out.printf("\"%s\"님의 패배입니다!", currPlayer.name);

				boolean deadPlayerExists = false;

				for (int i = 0; i < players.length; ++i) {
					if (i == currPlayerIndex) {
						players[i].ratingDown(3000);
						deadPlayerExists = players[i].rating < 0;
					} else {
						players[i].ratingUp(500);

					}
				}
				if (deadPlayerExists) {
					System.out.printf("\"%s\"님의 점수가 마이너스이므로 게임을 종료합니다!!\n", currPlayer.name);
					printAllPlayers();
					break;
				}
				printAllPlayers();
				sc.nextLine();
				System.out.print("게임을 더 진행하시겠습니까? (Y/N) ");
				
				String select = sc.nextLine();
				char cmd = select.charAt(0);

				if (cmd == 'Y' || cmd == 'y') {
					turn = 0;
				game.shuffle();
				System.out.println("새 게임이 시작됩니다!");
			} else if (cmd == 'N' || cmd == 'n') {
				System.out.println("그만하기를 선택하셔서 게임을 종료합니다.");
				break;
			}
		}

	}

	printEndInfo();

	}

	public static void main(String[] args) {
		new PirateGameConsole().start();
	}
}
