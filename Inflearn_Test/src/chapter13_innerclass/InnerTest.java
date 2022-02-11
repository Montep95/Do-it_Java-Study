package chapter13_innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() // ������
	{
		inClass = new InClass();
	}
	
	private class InClass{ // �̰��� ���� Ŭ������, static������ static �޼���� ����� �Ұ����ϴٴ� Ư¡�� ������.
		int inNum = 200;
	
		void inTest() { // �޼���, �ܺ�Ŭ������ ��� ������ �޼��带 ��밡���� ����Ŭ������ Ư¡
			System.out.println(num); // �ܺ�Ŭ������ ���� num������ ������ �� �� ����
			System.out.println(sNum);
		}
	}
	
	public void usingInTest()
	{
		inClass.inTest();
	}
	
	static class InStaticClass
	{
		int iNum = 100;
		static int sInNum = 200; // static�� �ܺ�Ŭ���������� ������ �� ������ �̷������� ���� ���� ����
		
		void inTest()
		{
			// num += 10; // �̴� �� �� ����
			sNum += 10; // �� ��찰�� ����Ÿ���̱⶧���� ����� ����
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			// System.out.println(iNum); // ���Ұ�
			System.out.println(sInNum);
		
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass(); // �����Ҷ� �� �ȿ��� InClass�� ������ �Ǵ� ����
		outClass.usingInTest(); // ����Ŭ���� ������ private���� �������� ��� �̷��� ������� �����	
								// ���� usingInTest()�� �Ҹ���, �� �ȿ��� inTest()�� �ҷ� ���Ǵ� �����
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); // ��ó�� ������ ����
		sInClass.inTest(); // inTest�� InStaticClass�� ȣ��ȴ��� ȣ���̵Ǿ���� (�ȿ� �����Ǿ������Ƿ�)
		
		
		OutClass.InStaticClass.sTest();
		
		/*
		outClass.inClass.inTest(); // ��ó�� ������ ������ (�ܺ�Ŭ���������� ����Ŭ������ ��밡��)
		
		OutClass.InClass inClass = outClass.new InClass(); // ����Ŭ������ �̷��� ������ (�ܺ�Ŭ������ �̹� �����Ȼ�Ȳ���� ���̴� ���)
		inClass.inTest();
		
		// �� ��� ���� classInClass�� InClass inClass; �� ��� private���� ����Ǿ������ʾƼ� ������
		// ������ �Ϲ������� private�� �ٿ��� �� (�ܺο��� ���Ǹ� �ȵǱ⶧��) 
		*/
	}

}
