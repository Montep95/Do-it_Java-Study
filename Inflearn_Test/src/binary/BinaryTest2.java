package binary;

public class BinaryTest2 {

	public static void main(String[] args) 
	{
		int num1 = 0B00000000000000000000000000000101; // 5
		int num2 = 0B11111111111111111111111111111011; // 본래 끝이 010 이지만 1을 더해줬으므로 011로 맺음 = -5
		
		int sum = num1 + num2;
		System.out.println(num1 + "와 " + num2 + "를 더하면 " + sum + "이 된다.");

	}

}
