package chapter10_interface;

public class CompleteCalc extends Calculator // implements Calc, Runnable{ Calculator 뒤에 이렇게 써줄 수 있고
											// 구현코드가 없는 인터페이스는 여러개 써줄 수 있다.
{
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0)
		{
			return num1 / num2;
		}
		else
			return ERROR;
	}
	
	public void showInfo()
	{
		System.out.println("Calc 인터페이스 구현 완료");
	}

	@Override
	public void description() {
		// super.description(); // 처음에는 이렇게 선언이 됨, Calc.java의 description의 print문을 호출함.
		System.out.println("완벽한 계산기 입니다.");
	}
	
	

}
