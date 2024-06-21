package myobj.prizedraw연습;

public class prize {

	String name;
	String value;
	int quantity;

	final static int All_QUANTITY = 300;
	
	public void prize( String name, String value, int quantity ) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
		
	}

	public String PrizeName() {
		return name;
	}

	public String HoldingValue() {
		return value;
	
	}

	public int LimitedQuantity() {
		return quantity;
		
	}

	public void print() {
		System.out.printf("%s 상품이 당첨되었습니다.", this.name);
	}
}

	
	
	
	
	
	
	
	
	
	/*
	 * 	public static void main(String[] args) {
		
		prize p1 = new prize();
		prize p2 = new prize();
		prize p3 = new prize();
		prize p4 = new prize();
		prize p5 = new prize();
		
		p1.PrizeName("ipade");
		p2.PrizeName("apple Watch");
		p3.PrizeName("bluetooth Speaker");
		p4.PrizeName("tiuss");
		p5.PrizeName(null);
		
		p1.HoldingValue("1등");
		p2.HoldingValue("2등");
		p3.HoldingValue("3등");
		p4.HoldingValue("4등");
		p5.HoldingValue(null);
		
		p1.LimitedQuantity(5);
		p2.LimitedQuantity(15);
		p3.LimitedQuantity(60);
		p4.LimitedQuantity(200);
		p5.LimitedQuantity(0);
		
	}
	
	void prizeInfo() {
		System.out.printf("1등 당첨!");
		System.out.printf("2등 당첨!");
		System.out.printf("3등 당첨!");
		System.out.printf("4등 당첨!");

	}
}

	 
	 */

