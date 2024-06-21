package yelim_book;

public class StudentTest {
	public static void main(String[] args) {
		Student StudentAhn = new Student();
		 
		// 클래스형 변수이름 = new 생성자
		StudentAhn.studentName = "안승연";
		
		System.out.println(StudentAhn.studentName);
		System.out.println(StudentAhn.getStudentName());
	}

}

