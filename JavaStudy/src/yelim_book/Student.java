package yelim_book;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 학생 이름과 주소 출력하는 메서드
		public void showStudentInfo() {
			System.out.println(studentName + "," + address);
		}
		
	//학생의 이름을 반환하는 메서드
	// 생성자 |반환: String | 메서드 이름 
	public String getStudentName() {
		return studentName;
	}
	//학생 이름을 부여하는 메서드
	// String name -> 학생 이름을 매개변수로 전달 
	//set: SN값을 지정하는 기능을 제공
	//반환 값은 없으니 void로 지정
	public void setStudentName(String name) {
		studentName = name;
	}
	
	//main()함수
	 public static void main(String[] args) {
		 
		 // 클래스형 변수이름 = new 생성자
		Student studentAhn = new Student(); // Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}

