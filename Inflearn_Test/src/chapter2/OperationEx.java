package chapter2;

public class OperationEx {

	public static void main(String[] args) {
		int age = 24;
		
		int age2 = -age; // ��ȣ �����ڴ� ��ó�� ������ ����� �����ϴ�.
		
		System.out.println(age);
		System.out.println(age2);
		// ===== ��ȣ ������ ===== // 
		
		// ===== ���� ������ ===== //
		boolean flag = (age > age2); // 24 > -24
		System.out.println(flag); // true
		
		// ===== �� ������ ===== //
		// =====�ܶ� ȸ�� ��===== //
		
		int num1 = 10;
		int i = 2;
		
		System.out.println("===== ���� �� ���� �� =====");
		System.out.println(num1);
		System.out.println(i);
		
		boolean value = ( ((num1 = num1 + 10) < 10) && ((i = i+2) > 10)); // ���� ���� ������ false�̱� ������ �ڴ� ���� ����
		// boolean value2 = ( ((num1 = num1 + 10) > 10) && ((i = i+2) > 10)); // ���� ���� ������ true�̱� ������ �ڸ� ������ i�� ����	
		
		System.out.println("===== ���� �� ���� �� =====");
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // i ���� �ٲ��� ���� ���� �� �� ���� 
		
		boolean value3 = ( ((num1 = num1 + 10) > 10) || ((i = i+2) > 10)); // ��'��' ���� ������ true�̱� ������
																		// �ڴ� �� �ʿ䵵 ���� true���� ������ ����
																		// i������ ����� ���� ����
		
		System.out.println("===== ���� �� ���� �� =====");
		System.out.println(value3);
		System.out.println(i);
		
		// ===== ���մ��� ������ ===== //
		
		int num2 = 10;
		System.out.println("===== ���� ���� ������ =====");
		
		System.out.println(num2 += 1); // 11
		System.out.println(num2 %= 10); // 10���� ���� ������, 1���
		
		num2 -= 1;
		System.out.println(num2); // 1���� 1�� �����Ƿ� 0���
		
		
	}

}
