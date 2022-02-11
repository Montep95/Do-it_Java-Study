package chapter11_classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person(); // �ν��Ͻ� person����
		
		Class pClass1 = person.getClass(); // getClass()�޼���� Object�� �޼����̰� �� �޼��带 ��ӹ޾ұ� ������ ����� ����
										// Ŭ������ Ŭ������ ��ȯ���ִ� �޼���
		System.out.println(pClass1.getName()); // ��Ű���̸�.Person�� ��µ�
		
		Class pClass2 = Person.class; // getClass()�޼���ó�� �̷��� ���"���ε�" ������ �� �ִ�.
		System.out.println(pClass2.getName()); // ���� �Ȱ��� ��Ű���̸�.Person�� ��µ�
		
		Class pClass3 = Class.forName("chapter11_classex.Person"); // forName�� Ŭ������ �̸��� ġ�� �� Ŭ������ ������ �� ����!, Add throws ����ó���� ���־����
		System.out.println(pClass3.getName()); // ���� �Ȱ��� ��Ű���̸�.Person�� ��µ�
		
		// pClass1, 2, 3 ����� ��� ���� �� ������ �˾ƾ���.
		
		
		Class pClass4 = Class.forName("java.lang.String");
		System.out.println(pClass4.getName());
		
		Person p = new Person();
		Class pClass5 = Class.forName("chapter11_classex.Person");
		
		//Person p2 = (Person)pClass5.newInstance();
		System.out.println(p);
		//System.out.println(p2);
		
		
	}

}
