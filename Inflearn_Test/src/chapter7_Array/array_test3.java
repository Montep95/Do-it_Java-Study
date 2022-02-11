package chapter7_Array;

public class array_test3 {
	
	// 알파벳 반복문으로 넣고 출력.

	public static void main(String[] args) {
		
		char[] alpha = new char[26]; //알파벳 배열
		char ch = 'A'; // 65
		
		for(int i =0; i < alpha.length; i++, ch++) // ch값을 증가시켜 알파벳을 순차적으로 넣을 수 있게 설계
		{
			alpha[i] = ch;
		}
		
		for(int i =0; i < alpha.length; i++, ch++) // ch값을 증가시켜 알파벳을 순차적으로 넣을 수 있게 설계
		{
			System.out.print(alpha[i] + " ");
		}
	}

}
