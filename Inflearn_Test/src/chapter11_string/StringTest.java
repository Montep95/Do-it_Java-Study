package chapter11_string;


public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2); // �ٸ��ٰ���, new�� ������ �� ��ü�� �ּҰ��� �ٸ��ٴ� �̾߱�.
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // ���ٰ���, ��� Ǯ�� ����� �ּҰ��� �����ϹǷ� ���� �ּҰ��� �ٶ�.
		
		// ===========���ڿ� ���� ����============ // ���� String �� final�� ������ byte[]��ü�̹Ƿ� �ٲ� �� ������ �����ϴ� ����
		String str5 = new String("java");
		String str6 = new String("android");
		
		str5 = str5.concat(str6);
		System.out.println(str5); // str5�� str6�� ������ �ƴϰ� java�� android�� �����ϴ� ���ο� �޸𸮰� �����ǰ� �� ���ڿ��� ����Ű�� �Ǵ� ���� (������ ����Ȱ� �ƴ϶�� ��)
		
		// ===========���ڿ� ���� "Ȯ��"����============ //
		String str7 = new String("java");
		String str8 = new String("android");
		
		System.out.println(System.identityHashCode(str7)); // ó�� ���ڿ� �ּ� ��
		
		str7 = str7.concat(str8);
		System.out.println(str7); // str5�� str6�� ������ �ƴϰ� java�� android�� �����ϴ� ���ο� �޸𸮰� �����ǰ� �� ���ڿ��� ����Ű�� �Ǵ� ���� (������ ����Ȱ� �ƴ϶�� ��)
		
		System.out.println(System.identityHashCode(str7)); // ���� ���ڿ� �ּ� ��
		
		// >> �ַ� StringBuilder, StringBuffer�� �����
	}

}
