package chapter7_Array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length); // 2 
		// 다차원배열에서는 배열의 길이는 행의 길이를 말한다. 2행 3열이므로 2가 출력이되는 것이다.
		// 그렇다면 열의 길이를 표시하기 위해선 어떻게 해야할까
		// 행의 길이 = arr.length
		// 열의 길이 = arr[i].length = 특정 행의 길이를 출력하게되어있으므로 열의 길이가 표시된다.
		
		System.out.println("============");
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < arr2.length ; i++)
		{
			if(i == 1) System.out.println(); // 내가 쓴 코드, 가독성을 위해 행별로 줄바꿈.
			
			for(int j = 0; j < arr2[i].length ; j++)
			{
				System.out.print(arr2[i][j] + " ");
				
			}
		}
		
		System.out.println();
		System.out.println("============");
		
		///// 과제 알파벳을 13x2 행렬에 반복문을 통해 입력하고 출력하라. /////
		char[][] alpha = new char[13][2];
	
		char input = 'A'; // 65
		
		for(int i = 0; i < alpha.length ; i++)
		{
			for(int j = 0; j < alpha[i].length; j++, input++)
			{
				alpha[i][j] = input;
				System.out.print(alpha[i][j] + " ");
				if(j == 1) System.out.println(); // 내가 쓴 코드, 가독성을 위해 행별로 줄바꿈.
			}

		}
	}

}
