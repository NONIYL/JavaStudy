package quiz;

import java.util.Arrays;

public class C09_PrizeDraw {

	/*
	  돌림판을 돌려서 경품을 추첨하는 프로그램을 만들어보세요.
	 
	  1. 경품들은 경품의 보유 가치와 한정된 수량이 있다
	  
	  2. 돌림판 인스턴스를 생성한 후 돌림판에 경품을 추가할 수 있어야 한다
	  
	 돌림판 돌 = new 돌림판(); 
	 돌.add(경품); 
	 돌.add(경품);
	  
	  3. 돌림판 인스턴스에 추가되어 있는 경품들이 당첨 확률을 수정할 수 있어야 한다
	  
      4. 수량이 모두 소진된 상품에 걸린다면 돌림판을 다시 돌린다
	  
	 */

	public static void main(String[] args) {
		PrizeWheel wheel = new PrizeWheel();

		wheel.addPrize("선풍기", 35000, 35, 20);
		wheel.addPrize("세탁기", 2000000, 10, 5);
		wheel.addPrize("츄파츕스", 100, 5000, 100);

		for (int i = 0; i < 100; ++i) {
			int prizeNum;
			switch (prizeNum = wheel.draw()) {
			case -1:
				System.out.println("꽝입니다!");
				break;
			case -2:
				System.out.println("당첨되었지만 수량이 모두 소진되었습니다!" + "기회가 한번 더 주어집니다!");
				break;
			default:
				wheel.printPrizeInfo(prizeNum);
				break;
			}
		}
	}
}

class Prize {
	private String name;
	private int value;
	private int qty;
	private int degree;
	

	public Prize(String name, int value, int qty, int degree) {
		this.name = name;
		this.value = value;
		this.qty = qty;
		this.degree = degree;
		
	}

	public String getName() {
		return name;
	}
	
	public int getQty() {
		return qty;
		
	}
	
	public int minusQty() {
		return --this.qty;
	}
		
	
	public int getDegree() {
		return degree; 
		
	}
	
	public void SetDegree(int degree) {
		this.degree = degree;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("\"%d원 상당의 %s\"", this.value, this.name);
	}
}

class PrizeDrawConsole {

	public static void main(String[] args) {
		PrizeWheel2 wheel = new PrizeWheel2();

		wheel.add(new Prize("에어컨", 3000000, 5, 3));
		wheel.add(new Prize("냉장고", 4000000, 3, 2));
		wheel.add(new Prize("츕파츕스", 100, 500, 1000));
		
		wheel.modifyDegree(5, 100);
		wheel.modifyDegree(2, 1000);
		wheel.modifyDegree(2, 356);
		
		for (int i = 0; i < 10; ++i) {
			Prize prize = wheel.draw();
		if (prize == null) {
			continue;
		}
		if (prize.getQty() !=0) {
			prize.minusQty();
			System.out.printf("[%s]를 뽑았습니다! (남은수량:%d, 당첨확률:%.2f%%)\n",
					prize, prize.getQty(), prize.getDegree() / 360.0 * 100);
		} else {
			System.out.println("[" + prize + "]를 뽑았지만 수량이 모두 소진되어 " 
					+ "다시 뽑아야 합니다!");
			--i;
		}
		}
		

	}
}
class PrizeWheel {
	final private static boolean DBUG_MODE = true;
	
	int[] win = new int[360];

	
	String[] prizeNames = new String[5];
	int[] prizeValues = new int[5];
	int[] prizeQty = new int[5];
	int[] prizeDegree = new int[5];

	int currPrizeIndex = 0;
	

	public void updateWheel() {
		for (int i = 0; i < win.length; ++i) {
			win[i] = -1;
		}
		int winIndex = 0;
		for (int i = 0; i < currPrizeIndex; ++i) {
			for (int j = 0; j < prizeDegree[i]; ++j) {
				win[winIndex++] = i;

			}

		}
		if (DBUG_MODE) {
			System.out.println("# 업데이트 된 확률배열의 정보");
			System.out.println(Arrays.toString(win));
		}
	}

	public int draw() {
		int prizeIndex = win[(int) (Math.random() * win.length)];
		
		int prizeNum = 0;
		if (prizeIndex == -1) {
			return -1;
		} else if (prizeQty[prizeNum] == 0) {
			return -2;
		}
		
		--prizeQty[prizeNum];
		
		return prizeNum;
	}

	public String printPrizeInfo(int prizeNum) {
		System.out.printf("%d원 상당의 %s[남은수량:%d, 당첨확률:%.2f%%]\n",
				prizeValues[prizeNum], 
				prizeNames[prizeNum],
				prizeQty[prizeNum],
				prizeDegree[prizeNum] / (double)win.length * 100);
		return null;
	}


	public void addPrize(String name, int value, int qty, int degree) {
		prizeNames[currPrizeIndex] = name;
		prizeValues[currPrizeIndex] = value;
		prizeQty[currPrizeIndex] = qty;
		prizeDegree[currPrizeIndex] = degree;

		++currPrizeIndex;

		updateWheel();

	}
}

class PrizeWheel2 {

	Prize[] win = new Prize[360];

	
	Prize[] prizeList = new Prize[5];
	int currIndex = 0;
	
	
	private int getTotalDegree() {
		int sum = 0;
		for (int i = 0; i < currIndex; ++i) {
			sum += prizeList[i].getDegree();
			
	}
	 return sum;
 }
	
	
	public void add(Prize prize) {
		if (prize.getDegree() < 0) {
			System.out.printf("추가하려는 상품 \"%s\"의 각도가 음수입니다.\n", prize);
			return;
		} else if (getTotalDegree() + prize.getDegree() > 360) {
			System.out.printf("\"%s\"를 추가하지 못했습니다! (각도 초과)", prize);
			return; 
		}
		prizeList[currIndex++] = prize;
		update();
	}


	public void modifyDegree(int prizeIndex, int degree) {
		if (prizeIndex >= currIndex || prizeIndex < 0) {
			System.out.println("[ERROR] 상품 수정 도중 에러가 발생했습니다." + "(인텍스가 올바르지 않음)");

			return; 

		}
		
		Prize toModify = prizeList[prizeIndex];
		
	
		if(degree < 0) {
			System.out.println("[ERROR] 수정하려는 각도가 음수입니다.");
			return;
		} else if (getTotalDegree() - prizeList[prizeIndex].getDegree()
				+ degree > 360) {
			System.out.printf("\"%s\"의 각도를 %d도에서 %d도로" + " 수정할 수 없습니다. (수정시 360도 초과)\n",
					toModify, toModify.getDegree(), degree);
			return;
		}
				

		prizeList[prizeIndex].SetDegree(degree);
		update();
	}

	private void update() {
		int wintIndex = 0;
		for (int i = 0; i < currIndex; ++i) {
			int degree = prizeList[i].getDegree();
			for (int j = 0; j < degree; ++j) {
				win[wintIndex++] = prizeList[i];
			}
		}
	}

	public Prize draw() {
		return win[(int) (Math.random() * win.length)];
	}
}
