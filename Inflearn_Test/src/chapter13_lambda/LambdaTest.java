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
	
	public static PrintString returnPrint() { // PrintString을 반환하는데, 
		return s -> System.out.println(s + "world"); // 매개변수 s를 가지고 s + world를 출력하라.
	}

}
