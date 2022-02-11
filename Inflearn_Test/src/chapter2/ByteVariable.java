package chapter2;

public class ByteVariable {

	public static void main(String[] args) 
	{
		// 바이트 자료형 처리 
		byte bData = -128; // 2의 7승을 의미함
		System.out.println(bData);
		
		byte bData2 = 127; // 128은 에러가 나게됨. (타입이 맞지않음을 의미) 
							// byte가 처리가능한 단위를 넘어선 것
		System.out.println(bData2);
		
		// int, long 자료형 처리
		int num = 10; // 여기서 10은 '리터럴'이라고 명칭함
		int level = 50;
		// int num2 = 12345678900; // 에러가 남, 4바이트로는 못담는 자료인것 long으로 처리할 것
			     					// 하지만 long으로 해도 오류가 남. 왜냐 기본적으로 4바이트로 저장되도록 기본 지정되어있기 때문.
				     				// long으로 저장하기 위해선 맨 뒤에 L을 써주어야함.
		
		long num3 = 12345678900L;
		System.out.println(num3);
		

	}

}
