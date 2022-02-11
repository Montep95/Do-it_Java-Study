package chapter13_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		// Arrays.stream(arr); // 스트림 선언, 다양한 메서드 사용가능
		int sum = Arrays.stream(arr).sum();
		
		// Arrays.stream을 
		IntStream stream = Arrays.stream(arr);
		// 해서 사용하여 줄여쓸 수 있지만 Stream은 한번 사용하면 소멸되기때문에 두번째 연산시에는 오류가 발생
		
	
	}

}
