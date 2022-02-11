package chapter2;

public class BreakEx2 {

	public static void main(String[] args) {
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) // 9단까지 반복하는 동안
		{
			times = 1;
			while (times <= 9) // 9까지 곱하는 동안
			{
				if(times > dan) break; // 2x2, 3x3... 등 그 단에서 times가 더 크지 않도록 반복
				System.out.println(dan + " X "  + times + " = " + dan*times);
				times++;
				
			}
			dan++;
			System.out.println();
		}
	}

}
