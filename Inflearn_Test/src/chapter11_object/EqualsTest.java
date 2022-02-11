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

	@Override // equals() �޼��� �������ϱ�
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
	
	public int hashCode() // equals���� ���� ������ ��ȯ�Ѵ�.
	{
		return studentID;
	}
	
	
}


public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // false�� ����
		System.out.println(str1.equals(str2)); // true�� ����, equals()�޼��� ��뿹��
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2); // false�� ����
		System.out.println(std1.equals(std2)); // �Ѵ� false�� ����
		// >> �� ��� equals()�޼��带 �������������
		
		// ===============�ؽ��ڵ� �޼��� ����====================//
		System.out.println(str1.hashCode());							// 3556498
		System.out.println(str2.hashCode()); // �� �ּҰ��� ���� ��µ�		// 3556498
		
		// ===============�ؽ��ڵ� �޼��� ����2====================//
		System.out.println(std1.hashCode());							
		System.out.println(std2.hashCode()); // �� �ּҰ��� �ٸ��� ��µ�.	>> ������ hashCode()�� �������ϰԵǸ� // 10001, 10001 �� ���� ����.
		
		// ===============�ؽ��ڵ� �޼��� ����3====================//
		System.out.println(System.identityHashCode(str1));				// 1435804085, 1784662007
		System.out.println(System.identityHashCode(str2)); // �� �ּҰ��� ����� ���� �ٸ��� identityHashCode()�� ���� �˾Ƴ� �� �̾���
		
		

	
	}

}
