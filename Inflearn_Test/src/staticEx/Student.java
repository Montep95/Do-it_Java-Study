package staticEx;

public class Student {

	private static int serialNum = 10000; // �ۿ��� ���ٺҰ�.
											// �����Ϸ��� Setter and Getter�� �޼��带 �����Ͽ� �� �޼��带 
											// �ٸ� Ŭ�������� �����ϵ��� �ϸ� �ذ��.
	
	int studentID;
	public static int getSerialNum() { // static �޼��忡���� 
		int i = 10; // �� �ȿ����� ����� "��������" 
					//	�ȿ����� �� �� ����
		
		i++;
		System.out.println(i);
		
		// studentName = 'ȫ�浿';  // ��� �Ұ�. 
								// "������� = �ν��Ͻ�����"�̹Ƿ�.
		return serialNum; // "static ����, Ŭ���� ����"
	}

	/* ������ ���������� ���� �Ұ�. �ּ�ó��.
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	*/

	String studentName;
	
	// �ٽ� �ڵ�
	public Student()
	{
		serialNum++; // �л��� �����ɶ����� serialNum�� ������Ų��. �� ��
		studentID = serialNum; // ��ó�� ���� ID���� �� ������ ���� ������Ѽ� �ʱ�ȭ���ִ� ���� 
	}
	
}
