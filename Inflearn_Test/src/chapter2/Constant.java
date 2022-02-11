package chapter2;

public class Constant {

	public static void main(String[] args) {

		final int STUDENT_NUM = 30;
		
		int num = 0;
		if (num == 30)
		{
			
		}
		
		System.out.println(30);

		// 상수를 선언하게 되면 가변적인 상황일 때 
		// 모든 30인 값을 바꿀필요없이
		// 상수값만 바꿔주면 된다는 장점이 있음
	
		final int STUDENT_NUM2 = 30;
		
		int num2 = 0;
		if (num2 == STUDENT_NUM2)
		{
			
		}
		
		System.out.println(STUDENT_NUM2);
	
	}

}
