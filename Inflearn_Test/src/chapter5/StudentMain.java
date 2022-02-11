package chapter5; // 같은 패키지안에 Student가 있기때문에 
					// 그곳의 변수를 참조하여 메인함수 실행 가능

public class StudentMain {

	public static void main(String[] args) // 메인함수의 형식 기억하기 
	{
		int i = 10; // int 와 같은 데이터타입을 "기본데이터타입"
		
		Student studentLee = new Student(); // Student 와 같은 데이터타입을 "참조형 데이터타입"이라고함
											// studentLee 는 블록안에 생성된 "지역변수"라고 말함.
											// Student() 는 "생성자"임.
		
		studentLee.studentName = "이순신"; // 참조형 데이터타입 옆에 선언된 studentName과 같은 변수를 "참조변수"라고함
		studentLee.studentID = 100;
		studentLee.address = "서울시 서초구 서초동";
		
		Student studentKim = new Student(); // studentKim 는 블록안에 생성된 "지역변수"라고 말함.
		studentKim.studentName = "홍길동";
		studentKim.studentID = 101;
		studentKim.address = "인천시 계양구 병방동";
		
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // 주소값이 출력됨 = 참조값이라고도 부름
										// chapter5.Student@5594a1b5
										// Student는 클래스이고
										// @뒤에서는 16진수 = 4바이트
										// 8자리이므로 32비트의 address(주소값)을 나타내는 것임.
		
		System.out.println(studentKim); // 주소값이 출력됨
		
	}

}
