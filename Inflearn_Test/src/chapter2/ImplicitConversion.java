package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10; // byte�� 1����Ʈ
		int num = bNum; // int�� 4����Ʈ 
		// ������ ����ȯ�� �Ͼ��! (�ڷ��� �ս��� �߻����� �ʰ�) - ���� ������ ū ���� ����ȯ
		System.out.println(num);
		
		long lNum = 10; // 8����Ʈ
		float fNum = lNum; // 4����Ʈ
		// ������ ����ȯ�� �Ͼ��! (long�� �������̰� float�� �Ǽ����̱⶧���� 
		// �� ������ float�� �ڿ������� ����ȯ�� �Ͼ��)
		System.out.println(fNum);
		
		double dNum = fNum + num; // �� ���� ���� ����� double������ ����ȯ�Ǿ� ����� �����Եȴ�.
		System.out.println(dNum);
		
		
	}

}
