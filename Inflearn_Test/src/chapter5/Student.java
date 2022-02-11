package chapter5;

public class Student
{
	// 학생 클래스가 가지는 정보
	int studentID; 
	String studentName;
	int grade;
	String address;
	
	
	// 클래스의 기능을 구현한 메서드 = 학생의 정보를 출력하는 기능
	public void showStudentInfo()
	{
		System.out.println(studentName);
		System.out.println(address);
	}
	
	public String getStudentName()
	// 매개변수는 없고 반환형이 있는 함수 정의
	// (학생이름을 받아오는 함수)
	{
		return studentName;
	}
	
	public void setStudentName(String name)
	// 매개변수는 있고 반환값이 없는 함수 정의
	// (학생이름을 재설정하는 함수)
	{
		studentName = name;
	}
}



