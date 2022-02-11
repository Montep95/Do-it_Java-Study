package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000; // 4����Ʈ
		byte bNum = (byte)iNum; // 1����Ʈ �̹Ƿ� 256�� (-128~127)������ ǥ�� 
								// 1000�� �� �� ����, ���� ©�� ���� ǥ�� (-24) ���
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14; // 8����Ʈ
		iNum = (int)dNum; // 4����Ʈ�� int�����ٰ� int�� ����ȯ�� �ְڴ�.
		System.out.println(iNum); // �Ҽ��� ���Ϻκ��� �����ǰ� ����̵ȴ�.
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // 3 + 0 = (int)3
		int num2 = (int)(dNum + fNum); // 3.14 + 0.9 = 4.23 -> (int)4 "0.23�κ��� ����(Truncate)�ȴ�."
		// �� �ΰ��� ���� ���̰� �ִ��� ��
		System.out.println(num1); 
		System.out.println(num2);
		
	}

}
