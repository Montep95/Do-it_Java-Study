package chapter10_interface;

public interface Calc
{
	/* ���� interface = �߻�Ŭ������ 3.14, -9999... ���� ��Ȯ�� ����� �����̵Ǹ� �ڵ������� public static final �̶�� �ؼ���.
	 * �� ����Ǻ��� �տ� public static final �� �ִ� ����.
	 */
	
	double PI = 3.14; // public static final
	int ERROR = -999999999;
	
	// �߻�޼����
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	// ��ó�� interface���� ����� �߻�޼������ �����̵ȴ�.

	
	default void description() // default = �⺻ �޼���, default�� �������� ������ ���� �߻�
	// ����Ʈ �޼��� = �⺻ ������ ������ �޼���, ����Ŭ�������� ������ ����
	{
		System.out.println("���� ���⸦ �����մϴ�."); // �� �ڵ尡 ������ ���� ������, CompleteCalc Ŭ�������� ��Ŭ�� �������̵��
													// �翬�� ������ ����.
	}
	
	static int total(int[] arr)
	{
		int total = 0;
		
		for(int i : arr)
		{
			total += i;
		}
		
		return total;
	}
}
