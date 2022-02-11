package chapter13_innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() // 생성자
	{
		inClass = new InClass();
	}
	
	private class InClass{ // 이것이 내부 클래스임, static변수와 static 메서드는 사용이 불가능하다는 특징을 가진다.
		int inNum = 200;
	
		void inTest() { // 메서드, 외부클래스의 모든 변수와 메서드를 사용가능한 내부클래스의 특징
			System.out.println(num); // 외부클래스의 변수 num이지만 가져다 쓸 수 있음
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
		static int sInNum = 200; // static은 외부클래스에서도 선언할 수 있지만 이런식으로 따로 선언 가능
		
		void inTest()
		{
			// num += 10; // 이는 쓸 수 없음
			sNum += 10; // 이 경우같은 정적타입이기때문에 사용이 가능
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			// System.out.println(iNum); // 사용불가
			System.out.println(sInNum);
		
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass(); // 선언할때 이 안에는 InClass도 생성이 되는 것임
		outClass.usingInTest(); // 내부클래스 관련을 private으로 묶어줬을 경우 이러한 방식으로 사용함	
								// 먼저 usingInTest()가 불리고, 그 안에서 inTest()가 불려 사용되는 방식임
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); // 이처럼 생성이 가능
		sInClass.inTest(); // inTest는 InStaticClass가 호출된다음 호출이되어야함 (안에 구현되어있으므로)
		
		
		OutClass.InStaticClass.sTest();
		
		/*
		outClass.inClass.inTest(); // 이처럼 선언이 가능함 (외부클래스에서는 내부클래스를 사용가능)
		
		OutClass.InClass inClass = outClass.new InClass(); // 내부클래스는 이렇게 생성함 (외부클래스가 이미 참조된상황에서 쓰이는 방법)
		inClass.inTest();
		
		// 이 모든 경우는 classInClass와 InClass inClass; 가 모두 private으로 선언되어있지않아서 가능함
		// 하지만 일반적으론 private를 붙여서 씀 (외부에서 사용되면 안되기때문) 
		*/
	}

}
