package myobj.wheel;

public class Prize {
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
	// myobj.wheel.Prize@3d012ddd를 추가하지 못했습니다! (각도 초과) 
	// object 보고오자
	@Override
	public String toString() {
		return String.format("\"%d원 상당의 %s\"", this.value, this.name);
	}
}

