package chapter2;

public class DoubleEx {
	
	int abc;

	public static void main(String[] args) {
		double dNum = 3.14; // �⺻�� ������ double������ �����.
		float fNum = 3.14F; // float ���� ��� �� F�� �ڿ� �ٿ������
		
		/*
		 * 
		 * �ڷ��� ���� ���� ����ϱ����ؼ� (�ڹ� 10)
		 * ���� ���� ������ �߷� ���
		 * " var "
		 * �ѹ� �ڷ����� �����ϸ� �ٲ� �� ����
		 * var num = 10; -> var num = "Hello" (x)
		 * ��� �������� ����̹Ƿ� ���� abc�� ���� �������� var�� ����� �� ����!
		 */

		
		var num = 10;
		var num2 = 10.0;
		var str = "Hello";
		System.out.println("===�׽�Ʈ �� ���===");
		System.out.println(dNum + " " + fNum);
		System.out.println(num + " " + num2 + " " + str);
		
	}

}
