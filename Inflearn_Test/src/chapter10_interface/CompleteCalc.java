package chapter10_interface;

public class CompleteCalc extends Calculator // implements Calc, Runnable{ Calculator �ڿ� �̷��� ���� �� �ְ�
											// �����ڵ尡 ���� �������̽��� ������ ���� �� �ִ�.
{
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0)
		{
			return num1 / num2;
		}
		else
			return ERROR;
	}
	
	public void showInfo()
	{
		System.out.println("Calc �������̽� ���� �Ϸ�");
	}

	@Override
	public void description() {
		// super.description(); // ó������ �̷��� ������ ��, Calc.java�� description�� print���� ȣ����.
		System.out.println("�Ϻ��� ���� �Դϴ�.");
	}
	
	

}
