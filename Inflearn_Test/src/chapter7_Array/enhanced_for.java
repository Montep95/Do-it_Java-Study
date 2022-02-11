package chapter7_Array;

public class enhanced_for {

	public static void main(String[] args) {
		
		String[] strArr = {"Java", "Android", "C"};
		
		// 기존 for문 // 
		for (int i = 0; i<strArr.length; i++)
		{
			System.out.println(strArr[i]); // 이런 일반적인 것이 아닌.
		}
		
		// 향상된 for문 //
		for (String s : strArr) // strArr배열의 하나하나 요소가 s 임시변수에 들어간다.
		{
			System.out.println(s); // 위와 같은 결과가 나옴.
		}
		
		// 향상된 for문 또다른 예제 // 
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr)
		{
			System.out.println(num);
		}
		
	}

}
