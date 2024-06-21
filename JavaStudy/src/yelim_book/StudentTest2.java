package yelim_book;

public class StudentTest2 {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student Student2 = new Student();
		Student2.studentName = "안승연";
		
		//참조변수값 출력
		System.out.println(student1);
		System.out.println(Student2);
		
		// 참조변수값 : 클래스 이름@주소 값(=코드값)
//		yelim_book.Student@75a1cd57
//		yelim_book.Student@515f550a
	}

}
