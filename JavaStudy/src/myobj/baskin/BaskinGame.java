package myobj.baskin;

public class BaskinGame {
	//초기화 하지 않은 인스턴스 변수는 기본적으로 배열처럼 기본값을 가지고 있다
	//눈에 보이지 않지만 초기화가 되어있어 굳이 =0 으로 초기화 안해도 된다.
	int lastNum;
	
	//초기화하지 않은 인스턴스 변수는 배열처럼 기본값을 갖고있다
	int currentNum;
	
	//기본생성자 : 매개변수가 아무것도 없는 생성자 (현재없음) 
	
	// 매개변수가 있으므로 기본 생성자 아님
	public BaskinGame(int lastNum) {	
		this.lastNum = lastNum;
	}
	
	/*
	 	@param num - 사용자가 게임을 위해 선택한 숫자를 전달해주세요
	 	@return -1 : 사용자가 1 ~ 3을 벗어나는 값을 입력한 경우
	 	-2: 사용자가 마지막 값을 벗어나는 숫자를 더하려고 하는 경우 
	 */
	
	public int next(int num) {
		if (num < 1 || num > 3) {
			return -1;
		} else if (currentNum + num > lastNum) {
			return -2;
			
		}
		return currentNum += num; // 예외처리 위에서 다 했으니 맘편히 더하자
	}
	
	public boolean isEnd() {
		return currentNum == lastNum;
	}
}
