package myobj.BlackJack연습;

import java.util.ArrayList;
import java.util.List;

public class Card {

	static int[] A = new int[11];

	int J = 10;
	int Q = 10;
	int K = 10;

	private static char[] shape = { '♥', '♠', '◆', '♣' };
	private static String[] num = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public Card(char[] shape, String[] suit) {
		this.shape = shape;
		this.num = num;
	}

public static void main(String[] args) {
	List<Card> cards = new ArrayList<>();
	for(char shape : shape) {
		for (String num : num) {
//			cards.add(shape, num);
		}
	}
	
	}
	
}

