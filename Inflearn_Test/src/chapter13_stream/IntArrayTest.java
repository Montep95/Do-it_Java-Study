package chapter13_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		// Arrays.stream(arr); // ��Ʈ�� ����, �پ��� �޼��� ��밡��
		int sum = Arrays.stream(arr).sum();
		
		// Arrays.stream�� 
		IntStream stream = Arrays.stream(arr);
		// �ؼ� ����Ͽ� �ٿ��� �� ������ Stream�� �ѹ� ����ϸ� �Ҹ�Ǳ⶧���� �ι�° ����ÿ��� ������ �߻�
		
	
	}

}
