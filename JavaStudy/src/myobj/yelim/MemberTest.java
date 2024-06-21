package myobj.yelim;

public class MemberTest {
	
	private String name;
	private String userId;
	private int age;
	
	
	public MemberTest (String name, String userId, int age) {
		this.name = name;
		this.userId = userId;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return ("이름: " + name + " 아이디: " + userId + " 나이: " + age);
	}
	
	
public static void main(String[] args) {
	
	MemberTest menber = new MemberTest("홍길동","user01", 100);
	System.out.println(menber);
	
	
}
}