package chapter2;

public class BreakEx2 {

	public static void main(String[] args) {
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) // 9�ܱ��� �ݺ��ϴ� ����
		{
			times = 1;
			while (times <= 9) // 9���� ���ϴ� ����
			{
				if(times > dan) break; // 2x2, 3x3... �� �� �ܿ��� times�� �� ũ�� �ʵ��� �ݺ�
				System.out.println(dan + " X "  + times + " = " + dan*times);
				times++;
				
			}
			dan++;
			System.out.println();
		}
	}

}
