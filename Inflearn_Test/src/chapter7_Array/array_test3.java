package chapter7_Array;

public class array_test3 {
	
	// ���ĺ� �ݺ������� �ְ� ���.

	public static void main(String[] args) {
		
		char[] alpha = new char[26]; //���ĺ� �迭
		char ch = 'A'; // 65
		
		for(int i =0; i < alpha.length; i++, ch++) // ch���� �������� ���ĺ��� ���������� ���� �� �ְ� ����
		{
			alpha[i] = ch;
		}
		
		for(int i =0; i < alpha.length; i++, ch++) // ch���� �������� ���ĺ��� ���������� ���� �� �ְ� ����
		{
			System.out.print(alpha[i] + " ");
		}
	}

}
