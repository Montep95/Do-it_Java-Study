package chapter11_string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1)); // 99~~~
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer)); // 38~~~
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer)); // 38~~~ ���� ����
		
		String str2 = buffer.toString(); // �� ������ String�� ȣ���ؼ� str2�� ����
		System.out.println(str2); // ����ϱ� ���ؼ� ������ ���̰� str2�� ����ϸ� java and android�� ��µ�
		
	}

}
