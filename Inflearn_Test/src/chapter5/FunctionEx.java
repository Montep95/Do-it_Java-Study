package chapter5;

public class FunctionEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // �Լ��� �θ���.
		
		System.out.println(sum);
	}
	
	public static int add(int a, int b)
	// �Լ��� �����Ѵ�.
	{
		int result = a + b;
		return result;
		
	}

}
