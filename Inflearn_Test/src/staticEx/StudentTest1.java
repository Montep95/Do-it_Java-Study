package staticEx;

public class StudentTest1 {

	public static void main(String[] args) 
	{
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); // 10001

		Student studentT = new Student();
		System.out.println(studentT.studentID); // 10002
	
		System.out.println("���� private���������� ����"); // ���м�
		System.out.println(studentJ.getSerialNum()); // 10002, ����� ��� ��
		// System.out.println(Student.serialNum); // static �������� �����Ҷ� �ٷ� Ŭ�����̸����� �����ϸ��.
		
		System.out.println(studentT.getSerialNum()); // 10002 �Ѵ� serialNum ���� ���� ����Ŵ (������ ���̱⶧����)
		
		
	}

}
