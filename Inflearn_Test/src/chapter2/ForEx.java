package chapter2;

public class ForEx {

	public static void main(String[] args) 
	{
		// ===== ������ =====
		System.out.println("===== for �� ������ =====");
		int dan, times;
		
		for (dan = 2; dan <= 9; dan++)
		{
			for (times = 1; times <= 9; times++)
			{
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println();
		}
		
		// ===== while �� ������ ===== // 
		
		System.out.println("===== while �� ������ =====");
		
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
		
		// ===== while �� ������ ===== // 
		
		System.out.println("===== for �� '1~100���� ¦�� ���ϱ� ���α׷�' =====");
		
		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num++)
		{
			if ( (num % 2) == 1) // Ȧ���� ���! ������ �Ͽ���!
			{
				continue;
			}
			
//			if ( (num % 2) == 0) // ¦���� ���! ������ �Ͽ���! 
//			{
//				continue;
//			}
//			
			total += num; // ¦���� ��쿡�� total���� ����
		}
		
		System.out.println("1~100���� ���� ¦���� ���� = " + total + " �Դϴ�."); 
		// 1~100���� �� ���ϸ� 5050��.
		// ¦���� = 2550
		// Ȧ���� = 2500
				
		
	}

}
