package this_ex;

class Person
{
	String name;
	int age;
	
	public Person()
	{
		// name = "test"; = �̰�� ������������ �޸𸮿� ���� �������̹Ƿ� ����
		
		this("�̸�����", 1); // ���� �� �ڵ尡 ���� ���� ���;��� (�� ������ �ȿ���)
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf()
	{
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person(); // �̰��� ȣ�������� �⺻ ���� "�̸�����", 1 �̶�� �������ְ����
									// �׷��ٸ� ���� Person()�� ȣ���ϰԵ� 
		System.out.println(p1.name); // p1�� �̸��� ����غ��� �̸������� ��µ�
		
		Person p2 = new Person("ȫ�浿", 28);
		System.out.println(p2.name + " " + p2.age); // ���� �� ����
		
		System.out.println(p1.returnSelf()); // this ���� ��µ��� Ȯ���� �� ����
		

	}

}
