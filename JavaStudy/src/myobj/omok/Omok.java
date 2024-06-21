package myobj.omok;

public class Omok {

	final static char[] OMOK_CHARS = { '┼', '┌', '┬', '┐', '├', '┤', '└', '┴', '┘', '╂', '●', '○' };

	final public static int BLACK_STONE = 10;
	final public static int WHITE_STONE = 11;

	final public static int BOARD_WIDTH = 15;
	final public static int BOARD_HEIGHT = 15;
	final public static int BOARD_SLASH = 15;

	int[][] board;

	public Omok() {
		board = new int[][] { { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 }, // 1
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 2
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 3
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 4
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 5
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 6
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 7
				{ 4, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 5 }, // 8
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 9
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 10
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 11
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 12
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 13
				{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }, // 14
				{ 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8 }, // 15

		};
	}

	// 놓기 전에 진행하는 체크 (삼삼 같은것..)
	public int precheck(int x, int y, int stone) {
		return 0;
	}

	// 놓은 후에 진행하는 체크 (승리여부)
	public int postCheck(int x, int y, int stone) {

		// 가로로 연속으로 놓였있는 돌의 개수를 세기
		int count = 0;
		// 방금 놓은 위치로부터 가로 오른쪽 체크
		for (int i = x; i < BOARD_WIDTH; ++i) {
			if (board[y][i] == stone) {
				// y는 그대로 x자리만 늘어나며 난 그 돌만 세겠다
				++count;
			} else {
				break;
			}

		}

		// 왼쪽( 방금 놓은 위치 미포함)
		for (int i = x - 1; i >= 0; --i) {
			if (board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}

		if (count == 5) {
			return 1; // 승리
		}

		count = 0;

		// 세로로 연속으로 놓여있는 돌의 개수를 세기
		for (int i = y; i < BOARD_HEIGHT; ++i) {
			if (board[i][x] == stone) {
				++count;
			} else {
				break;
			}
		}
		for (int i = y - 1; i < BOARD_HEIGHT; --i) {
			if (board[i][x] == stone) {
				++count;
			} else {
				break;
			}

			if (count == 5) {
				return 1;
			}
		}
			
			//대각선 <과제>
			
		count = 0; 
		
		for( int i = x; i < BOARD_WIDTH; ++i) {
			for ( int j = x + 1; j < BOARD_HEIGHT; ++j) {
				
				
				
			}
		}


		return 0; // 아무것도 아님
	}

	public boolean putBlack(int x, int y) {
		return putStone(x, y, BLACK_STONE);
	}

	public boolean putWhite(int x, int y) {
		return putStone(x, y, WHITE_STONE);
	}

	public boolean putStone(int x, int y, int stone) {
		if (x >= BOARD_WIDTH || x < 0 || y >= BOARD_HEIGHT || y < 0) {
			System.out.printf("[SYSTEM] 그곳은 놓을 수 없는 위치입니다.(%d, %d)\n", x, y);
			return false;
		}
		int v = board[y][x];

		if (v != BLACK_STONE && v != WHITE_STONE) {
			board[y][x] = BLACK_STONE;
			return true;
		} else {
			System.out.printf("[SYSTEM] 그곳은 이미 돌이 놓여있는 위치입니다.(%d, %d)\n", x, y);
			return false;
		}
	}

	public void printBoard() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.printf("%2c", OMOK_CHARS[board[i][j]]);
			}
			System.out.println();
		}
	}

}

// 야가다
//public void printBoard() {
//	for (int i = 0; i < board.length; ++i) {
//		for (int j = 0; j < board[i].length; ++j) {
//			System.out.printf("%2c", OMOK_CHARS[board[i][j]]);
////			if (board[i][j] == 1) {
////				System.out.printf("%2c", '┌');
////			} else if (board[i][j] == 2) {
////				System.out.printf("%2c", '┬');
////			} else if (board[i][j] == 3) {
////				System.out.printf("%2c", '┐');
////			} else if (board[i][j] == 4) {
////				System.out.printf("%2c", '┌');
////			} else if (board[i][j] == 6) {
////				System.out.printf("%2c", '└');
////			} else if (board[i][j] == 5) {
////				System.out.printf("%2c", '┬');
////			} else if (board[i][j] == 7) {
////				System.out.printf("%2c", '┬');
////			} else if (board[i][j] == 8) {
////				System.out.printf("%2c", '┘');
////			} else if (board[i][j] == 9) {
////				System.out.printf("%2c", '╊');
////			} else {
////				System.out.printf("%2c", '┼');
////			}
//		}
//		System.out.println();
//	}
//}
//
//}
