package chapter7_Array;

public class array_test 
{
	public static void main(String[] args)
	{
		/// ù��° �迭 ���� ���� /// 
		int[] numbers = new int[10]; // 10��¥�� �迭 = 40����Ʈ�� ũ�� (int�� 4����Ʈ�̹Ƿ�)
									// int�ڷ����� ��� ��� ���� 0���� �ʱ�ȭ�ȴ�. ��ü�ΰ�쿡�� null�� �ʱ�ȭ�ȴ�.
									// double�ڷ����� ��� 0.0���� �ʱ�ȭ�ȴ�.
		int[] numbers2 = new int[] {0, 1, 2}; // �迭�� �ʱ�ȭ�Ҷ��� []�ȿ� ���ڸ� �����ϸ� �ȵǰ�, ���� {}�� �����������.
		
		System.out.println(numbers2.length); // 3
		
		/// �ι�° �迭 ���� ���� ///
		int[] numbers3 = new int[3];
		
		numbers3[0] = 1; // ù��° �ε����� 1�� �ִ´�.
		numbers3[1] = 2;
		numbers3[2] = 3;
		
		for(int i = 0; i<numbers3.length; i++)
		{
			System.out.println(numbers3[i]);
		}
		
		/// ����° �迭 ���� ���� ///
		int[] numbers4 = {1,2,3};
		
	}
}
