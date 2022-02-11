package staticEx;

public class Student {

	private static int serialNum = 10000; // 밖에서 접근불가.
											// 접근하려면 Setter and Getter로 메서드를 생성하여 그 메서드를 
											// 다른 클래스에서 참조하도록 하면 해결됨.
	
	int studentID;
	public static int getSerialNum() { // static 메서드에서는 
		int i = 10; // 이 안에서만 선언된 "지역변수" 
					//	안에서만 쓸 수 있음
		
		i++;
		System.out.println(i);
		
		// studentName = '홍길동';  // 사용 불가. 
								// "멤버변수 = 인스턴스변수"이므로.
		return serialNum; // "static 변수, 클래스 변수"
	}

	/* 가져가 쓸수만있지 수정 불가. 주석처리.
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	*/

	String studentName;
	
	// 핵심 코드
	public Student()
	{
		serialNum++; // 학생이 생성될때마다 serialNum을 증가시킨다. 그 후
		studentID = serialNum; // 이처럼 각각 ID마다 그 증가된 값을 복사시켜서 초기화해주는 과정 
	}
	
}
