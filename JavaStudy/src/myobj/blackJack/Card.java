package myobj.blackJack;

public class Card {
	private static char[] SUITS = { '♥', '♠', '◆', '♣' };
	private static String[] RANK = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	final public static int[] VALUES = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

	final public static int NUM_OF_SUITS = SUITS.length;
	final public static int NUM_OF_RANKS = RANK.length;

	int suit; // 무늬
	int rank; // A~K

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;

	}

	public int getValue() {
		return VALUES[rank];

	}

	@Override
	public String toString() {
		return String.format("%c%s", SUITS[suit], RANK[rank]);
	}

	public static void main(String[] args) {
		System.out.println(new Card(0, 5));
		System.out.println(new Card(3, 5));
		System.out.println(new Card(2, 7));
		System.out.println(new Card(3, 8));
	}

}
