package chapter5; // ���� ��Ű���ȿ� Student�� �ֱ⶧���� 
					// �װ��� ������ �����Ͽ� �����Լ� ���� ����

public class StudentMain {

	public static void main(String[] args) // �����Լ��� ���� ����ϱ� 
	{
		int i = 10; // int �� ���� ������Ÿ���� "�⺻������Ÿ��"
		
		Student studentLee = new Student(); // Student �� ���� ������Ÿ���� "������ ������Ÿ��"�̶����
											// studentLee �� ��Ͼȿ� ������ "��������"��� ����.
											// Student() �� "������"��.
		
		studentLee.studentName = "�̼���"; // ������ ������Ÿ�� ���� ����� studentName�� ���� ������ "��������"�����
		studentLee.studentID = 100;
		studentLee.address = "����� ���ʱ� ���ʵ�";
		
		Student studentKim = new Student(); // studentKim �� ��Ͼȿ� ������ "��������"��� ����.
		studentKim.studentName = "ȫ�浿";
		studentKim.studentID = 101;
		studentKim.address = "��õ�� ��籸 ���浿";
		
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // �ּҰ��� ��µ� = �������̶�� �θ�
										// chapter5.Student@5594a1b5
										// Student�� Ŭ�����̰�
										// @�ڿ����� 16���� = 4����Ʈ
										// 8�ڸ��̹Ƿ� 32��Ʈ�� address(�ּҰ�)�� ��Ÿ���� ����.
		
		System.out.println(studentKim); // �ּҰ��� ��µ�
		
	}

}
