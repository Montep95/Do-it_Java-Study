package chapter8_inheritance;

public class Circle { // extends Point ó�� ����ϸ� �ȵȴ�. �Ϲ������� ����� ��ü������ Ȱ���ϰ��� ���µ�, 
						// Circle�� Point�� ��ü���̰� �Ϲ����� ���谡 �ƴ϶� �׳� ������ ���� �����̱⶧���̴�.
	
	Point point; // ��ó�� ���־� ��Ӻ��ٴ� �� Ŭ�������� �״�� ���ڴٴ� ���� �������־����
	
	/*
	private int x;
	private int y;
	*/
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
	
}
