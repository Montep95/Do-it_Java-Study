package chapter7_Array;

public class array_test 
{
	public static void main(String[] args)
	{
		/// 첫번째 배열 생성 예제 /// 
		int[] numbers = new int[10]; // 10개짜리 배열 = 40바이트의 크기 (int는 4바이트이므로)
									// int자료형인 경우 모든 값이 0으로 초기화된다. 객체인경우에는 null로 초기화된다.
									// double자료형인 경우 0.0으로 초기화된다.
		int[] numbers2 = new int[] {0, 1, 2}; // 배열을 초기화할때는 []안에 숫자를 지정하면 안되고, 값을 {}로 지정해줘야함.
		
		System.out.println(numbers2.length); // 3
		
		/// 두번째 배열 생성 예제 ///
		int[] numbers3 = new int[3];
		
		numbers3[0] = 1; // 첫번째 인덱스에 1을 넣는다.
		numbers3[1] = 2;
		numbers3[2] = 3;
		
		for(int i = 0; i<numbers3.length; i++)
		{
			System.out.println(numbers3[i]);
		}
		
		/// 세번째 배열 생성 예제 ///
		int[] numbers4 = {1,2,3};
		
	}
}
