package staticEx;

public class StudentTest1 {

	public static void main(String[] args) 
	{
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); // 10001

		Student studentT = new Student();
		System.out.println(studentT.studentID); // 10002
	
		System.out.println("밑의 private접근제어자 접근"); // 구분선
		System.out.println(studentJ.getSerialNum()); // 10002, 노란줄 경고가 뜸
		// System.out.println(Student.serialNum); // static 변수들은 참조할때 바로 클래스이름으로 참조하면됨.
		
		System.out.println(studentT.getSerialNum()); // 10002 둘다 serialNum 같은 값을 가리킴 (증가된 값이기때문에)
		
		
	}

}
