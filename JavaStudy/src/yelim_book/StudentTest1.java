package yelim_book;

public class StudentTest1 {

	public static void main(String[] args) {
		//첫번째 학생 생성
		Student Student1 = new Student();
		Student1.studentName = "안연수";
		System.out.println(Student1.getStudentName());
		
		//두번째 학생 생성
		Student Student2 = new Student();
		Student2.studentName = "안승연";
		System.out.println(Student2.getStudentName());

	}

}
