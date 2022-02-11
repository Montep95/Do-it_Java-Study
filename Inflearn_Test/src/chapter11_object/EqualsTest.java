package chapter11_object;

class Student
{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName)
	{
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override // equals() 메서드 재정의하기
	public boolean equals(Object obj) { 
		if (obj instanceof Student)
		{
			Student std = (Student)obj;
			
			if(studentID == std.studentID)
				return true;
			else
				return false;
			
		}
		return false;
	}
	
	public int hashCode() // equals에서 쓰인 변수를 반환한다.
	{
		return studentID;
	}
	
	
}


public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // false가 나옴
		System.out.println(str1.equals(str2)); // true가 나옴, equals()메서드 사용예제
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2); // false가 나옴
		System.out.println(std1.equals(std2)); // 둘다 false가 나옴
		// >> 이 경우 equals()메서드를 재정의해줘야함
		
		// ===============해시코드 메서드 예제====================//
		System.out.println(str1.hashCode());							// 3556498
		System.out.println(str2.hashCode()); // 두 주소값이 같게 출력됨		// 3556498
		
		// ===============해시코드 메서드 예제2====================//
		System.out.println(std1.hashCode());							
		System.out.println(std2.hashCode()); // 두 주소값이 다르게 출력됨.	>> 위에서 hashCode()를 재정의하게되면 // 10001, 10001 로 같게 나옴.
		
		// ===============해시코드 메서드 예제3====================//
		System.out.println(System.identityHashCode(str1));				// 1435804085, 1784662007
		System.out.println(System.identityHashCode(str2)); // 두 주소값이 사실은 조금 다름을 identityHashCode()를 통해 알아낼 수 이었음
		
		

	
	}

}
