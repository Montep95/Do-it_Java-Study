package chapter2;

public class ByteVariable {

	public static void main(String[] args) 
	{
		// ����Ʈ �ڷ��� ó�� 
		byte bData = -128; // 2�� 7���� �ǹ���
		System.out.println(bData);
		
		byte bData2 = 127; // 128�� ������ ���Ե�. (Ÿ���� ���������� �ǹ�) 
							// byte�� ó�������� ������ �Ѿ ��
		System.out.println(bData2);
		
		// int, long �ڷ��� ó��
		int num = 10; // ���⼭ 10�� '���ͷ�'�̶�� ��Ī��
		int level = 50;
		// int num2 = 12345678900; // ������ ��, 4����Ʈ�δ� ����� �ڷ��ΰ� long���� ó���� ��
			     					// ������ long���� �ص� ������ ��. �ֳ� �⺻������ 4����Ʈ�� ����ǵ��� �⺻ �����Ǿ��ֱ� ����.
				     				// long���� �����ϱ� ���ؼ� �� �ڿ� L�� ���־����.
		
		long num3 = 12345678900L;
		System.out.println(num3);
		

	}

}
