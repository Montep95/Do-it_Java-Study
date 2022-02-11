package chapter10_interface;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		// = CompleteCalc calc = new CompleteCalc();
		// = Calculator calc = new CompleteCalc(); 와 같은 의미.
		// 저 타입에 종속돼서 사용할 수 있는 메서드들이기때문이다.
		
		System.out.println(calc.add(num1, num2)); // 12
		
		calc.description(); // 완벽한 계산기입니다. (오버라이드되어서 재정의된 코드가 불려짐)
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum); // 1,2,3,4,5 를 다 더한 값이 출력됨
	}

}
