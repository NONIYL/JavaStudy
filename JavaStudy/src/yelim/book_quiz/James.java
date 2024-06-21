package yelim.book_quiz;

/*
 * 
 [SET과 GET의 차이점]
 
set = 설정, get = 값을 가져오는 것

User-id 라는 변수를 선언을 한다고 가정했을 때, User-id의 변수에 어떠한 값(ID)에 저장(set)을 한다.

User-id 에 저장된 값을 불러오는 것이 get이다.
돼지저금통을 만든다  > 변수 선언
그 안에 돈이 얼마나 들어 있는지 본다 > get

SET과 GET 사용이유
결국에는, SET, GET 메소드를 사용하는 이유는 외부로부터 변수값에 직접적으로 접근하는것을 막기 위해서다. 직접 접근하개 되면 값이 변하게 되고 그러면 데이터 무결성이 깨질 수 있기 때문이다.

 

대표적으로 자바에서는 함수를 통해 값을 전달받고, 전달하고 방식을 권장하고 있다. 

또한 클래스 내에서 변수 private(캡슐화, 정보은닉)를 선언해서 외부에서 접근할 수 없도록 한다.

 ---------------------------------------------------------------------------------------------------------
 
	 	나이가 40살, 이름이 james라는 남자가 있다. 이 남자는 결혼을 했고, 자식이 셋이나 있다
	 	
	 	<출력 결과>
	 	나이
	 	이름
	 	결혼 여부
	 	자녀 수 
	 	
	 	Do it -152p
 */

public class James {
	int JAge;
	String JName;
	boolean merried;
	int childrenNum;
	
	
	public int getAge() { 
		return JAge;
	}
	
	public void setAge(int age) {
		JAge = age;
	}
	
	public String getName() {
		return JName;
	}
	
	public void setName(String name) {
		JName = name;
	}
	
	public boolean getMerried() {
		return merried;
	}
	
	public void setMerried(boolean marry) {
		merried = marry;
	}
	
	public int getChildrenNum() {
		return childrenNum;
	}
	
	public void setChildrenNum(int ChildNum) {
		childrenNum = ChildNum;
	}
	
	public static void main(String[] args) {
//		int JAge = 40;
//		String JName = "Jams";
//		boolean merried = true;
//		int childrenNum = 3;
		
		James j = new James();
		j.JAge = 40;
		j.JName = "JAMS";
		j.merried = true;
		j.childrenNum = 3;
		
		System.out.println(j.JAge);
		System.out.println(j.JName);
		System.out.println(j.merried);
		System.out.println(j.childrenNum);
		
	}

}
