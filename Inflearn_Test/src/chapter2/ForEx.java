package chapter2;

public class ForEx {

	public static void main(String[] args) 
	{
		// ===== 구구단 =====
		System.out.println("===== for 문 구구단 =====");
		int dan, times;
		
		for (dan = 2; dan <= 9; dan++)
		{
			for (times = 1; times <= 9; times++)
			{
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println();
		}
		
		// ===== while 문 구구단 ===== // 
		
		System.out.println("===== while 문 구구단 =====");
		
		int dan2 = 2;
		int times2 = 1;
		while (dan2 <= 9)
		{
			times2 = 1;
			while ( times2 <= 9)
			{
				System.out.println(dan2 + " X " + times2 + " = " + dan2*times2);
				times2++;
			}
			dan2++;
			System.out.println();
		}
		
		// ===== while 문 구구단 ===== // 
		
		System.out.println("===== for 문 '1~100까지 짝수 더하기 프로그램' =====");
		
		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num++)
		{
			if ( (num % 2) == 1) // 홀수인 경우! 증감을 하여라!
			{
				continue;
			}
			
//			if ( (num % 2) == 0) // 짝수인 경우! 증감을 하여라! 
//			{
//				continue;
//			}
//			
			total += num; // 짝수인 경우에만 total값에 더함
		}
		
		System.out.println("1~100까지 더한 짝수의 값은 = " + total + " 입니다."); 
		// 1~100까지 다 더하면 5050임.
		// 짝수만 = 2550
		// 홀수만 = 2500
				
		
	}

}
