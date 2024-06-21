package yelim_book;
/*
 	쇼핑몰에 주문이 들어왔다
 	
 	주문번호:201803120001
 	주문자 아이디: abc123
 	주문 날짜: 2018년 3월 12일
 	주문자 이름: 홍길순
 	주문 상품 번호: PD0345-12
 	배송 주소: 서울시 영등포구 여의도동 20번지
 	
 	Do it -152p
 */
public class shopping {
	
	String orderNum;
	String order_id;
	int date;
	String order_name;
	String productNum;
	String adress;
	
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	} 
	
	
	public static void main(String[] args) {
		
		shopping shop = new shopping();
		
		shop.orderNum = "201803120001";
		shop.order_id = "abc123";
		shop.date = 20180313;
		shop.order_name = "홍기순";
		shop.productNum = "PD0345-12";
		shop.adress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(shop.orderNum);
		System.out.println(shop.order_id);
		System.out.println(shop.date);
		System.out.println(shop.productNum);
		System.out.println(shop.adress);
	}
}