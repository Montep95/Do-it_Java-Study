package chapter13_innerclass;

class Outer
{
	// 전역변수들
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable(int i) // Runnable은 인터페이스이고 쓰레드를 생성할때 사용함
 	{
		int localNum = 100; // 지역변수
		
		class MyRunnable implements Runnable
		{

			@Override
			public void run() { // Runnable인터페이스는 꼭 run()메서드를 구현해야함
				
				outNum += 10;
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
			}
			
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
	}

}
