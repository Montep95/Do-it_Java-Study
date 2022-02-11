package chapter7_Array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length); // 2 
		// �������迭������ �迭�� ���̴� ���� ���̸� ���Ѵ�. 2�� 3���̹Ƿ� 2�� ����̵Ǵ� ���̴�.
		// �׷��ٸ� ���� ���̸� ǥ���ϱ� ���ؼ� ��� �ؾ��ұ�
		// ���� ���� = arr.length
		// ���� ���� = arr[i].length = Ư�� ���� ���̸� ����ϰԵǾ������Ƿ� ���� ���̰� ǥ�õȴ�.
		
		System.out.println("============");
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < arr2.length ; i++)
		{
			if(i == 1) System.out.println(); // ���� �� �ڵ�, �������� ���� �ະ�� �ٹٲ�.
			
			for(int j = 0; j < arr2[i].length ; j++)
			{
				System.out.print(arr2[i][j] + " ");
				
			}
		}
		
		System.out.println();
		System.out.println("============");
		
		///// ���� ���ĺ��� 13x2 ��Ŀ� �ݺ����� ���� �Է��ϰ� ����϶�. /////
		char[][] alpha = new char[13][2];
	
		char input = 'A'; // 65
		
		for(int i = 0; i < alpha.length ; i++)
		{
			for(int j = 0; j < alpha[i].length; j++, input++)
			{
				alpha[i][j] = input;
				System.out.print(alpha[i][j] + " ");
				if(j == 1) System.out.println(); // ���� �� �ڵ�, �������� ���� �ະ�� �ٹٲ�.
			}

		}
	}

}
