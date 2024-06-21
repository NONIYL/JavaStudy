package quiz;

import myobj.omok.Omok;

public class D08_Omok {
	
	//<과제> 게임 돌아가도록 콘솔 만들기
	
	public static void main(String[] args) {
		Omok omok = new Omok();
		
		omok.putBlack(3, 7);
		omok.putBlack(4, 7);
		omok.putBlack(5, 7);
		omok.putBlack(6, 7);
		omok.putBlack(7, 7);
		
		omok.putWhite(4, 8);
		omok.putWhite(4, 9);
		omok.putWhite(4, 10);
		omok.putWhite(4, 11);
		omok.putWhite(4, 12);
		
		
	
		System.out.println(omok.postCheck(7, 7, Omok.BLACK_STONE));
		System.out.println(omok.postCheck(4, 4, Omok.WHITE_STONE));
		
		omok.printBoard();
		
	}

}
