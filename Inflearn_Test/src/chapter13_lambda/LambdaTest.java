package chapter13_lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
	}
	
	public static void showMyString(PrintString lambda)
	{
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() { // PrintString�� ��ȯ�ϴµ�, 
		return s -> System.out.println(s + "world"); // �Ű����� s�� ������ s + world�� ����϶�.
	}

}
