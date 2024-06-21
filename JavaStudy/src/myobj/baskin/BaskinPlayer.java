package myobj.baskin;

public class BaskinPlayer {
	int playerSize;

	int user1;
	int user2;

	public BaskinPlayer(int playerSize) {
		this.playerSize = playerSize;
	}

	public int getPlayerNum(int turn) {
		return turn % playerSize + 1;

	}

}
