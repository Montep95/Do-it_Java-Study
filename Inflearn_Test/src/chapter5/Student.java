package chapter5;

public class Student
{
	// �л� Ŭ������ ������ ����
	int studentID; 
	String studentName;
	int grade;
	String address;
	
	
	// Ŭ������ ����� ������ �޼��� = �л��� ������ ����ϴ� ���
	public void showStudentInfo()
	{
		System.out.println(studentName);
		System.out.println(address);
	}
	
	public String getStudentName()
	// �Ű������� ���� ��ȯ���� �ִ� �Լ� ����
	// (�л��̸��� �޾ƿ��� �Լ�)
	{
		return studentName;
	}
	
	public void setStudentName(String name)
	// �Ű������� �ְ� ��ȯ���� ���� �Լ� ����
	// (�л��̸��� �缳���ϴ� �Լ�)
	{
		studentName = name;
	}
}



