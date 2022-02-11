package chapter13_lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str);
	}

}
