package chapter7_ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.showStudentInfo();
		
		System.out.println("===========");
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("수학", 100);
		studentKim.showStudentInfo();
	}

}
