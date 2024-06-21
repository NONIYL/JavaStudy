package myobj.blackJack;

import java.util.List;

public class GameLogic {

	final public static int BLACKJACK = 0;
	final public static int BURST = 1;
	final public static int PUSH = 2;
	
	final static int DEALER_WIN = 3;
	final static int PLAYER_WIN = 4;

	static int getValue(List<Card> cards) {
		int sum = 0;
		int aceCount = 0;
		
		for(Card card : cards) {
			int value = card.getValue();
			 sum += value;
			 
			 if(value == 11) {
				 ++aceCount;
			 }
		}
		
		//A를 보유하고 있고 현재 총합이 21을 넘는다면 반복하면서 10씩 뺀다 
		while (aceCount > 0 && sum > 21) {
			sum -= 10;
			--aceCount;
			
		}
		
		return sum;
	}

	static int check(List<Card> playerCards, List<Card> dealerCards ) {
		int v1 = getValue(playerCards);
		int v2 = getValue(dealerCards);
		
		if(v1 > 21) {
			return DEALER_WIN;
		} else if(v2 > 21) {
			System.out.println("딜러버스트!");
			return PLAYER_WIN;
		}else if (v1 > v2) {
			return PLAYER_WIN;
		} else if (v1 < v2) {
			return DEALER_WIN;
		} else {
			return PUSH;
		}
	}
}
