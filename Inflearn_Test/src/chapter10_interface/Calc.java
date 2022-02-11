package chapter10_interface;

public interface Calc
{
	/* 위의 interface = 추상클래스에 3.14, -9999... 등의 정확한 상수가 선언이되면 자동적으로 public static final 이라고 해석함.
	 * 각 상수의변수 앞에 public static final 이 있는 격임.
	 */
	
	double PI = 3.14; // public static final
	int ERROR = -999999999;
	
	// 추상메서드들
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	// 이처럼 interface에는 상수와 추상메서드들이 선언이된다.

	
	default void description() // default = 기본 메서드, default를 적어주지 않으면 오류 발생
	// 디폴트 메서드 = 기본 구현을 가지는 메서드, 구현클래스에서 재정의 가능
	{
		System.out.println("정수 계산기를 구현합니다."); // 이 코드가 마음에 들지 않으면, CompleteCalc 클래스에서 우클릭 오버라이드로
													// 당연히 재정의 가능.
	}
	
	static int total(int[] arr)
	{
		int total = 0;
		
		for(int i : arr)
		{
			total += i;
		}
		
		return total;
	}
}
