package chapter10_interface;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		// = CompleteCalc calc = new CompleteCalc();
		// = Calculator calc = new CompleteCalc(); �� ���� �ǹ�.
		// �� Ÿ�Կ� ���ӵż� ����� �� �ִ� �޼�����̱⶧���̴�.
		
		System.out.println(calc.add(num1, num2)); // 12
		
		calc.description(); // �Ϻ��� �����Դϴ�. (�������̵�Ǿ �����ǵ� �ڵ尡 �ҷ���)
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum); // 1,2,3,4,5 �� �� ���� ���� ��µ�
	}

}
