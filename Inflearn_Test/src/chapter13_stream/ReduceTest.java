package chapter13_stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) { // String���� �Ѿ�� ������ ���� BinaryOperator���� String���� �������־��⶧��
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"�ȳ��ϼ���", "����", "�ڹ�", "�������Դϴ�."}; // 4���� element
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			
						if(s1.getBytes().length >= s2.getBytes().length)
								return s1;
						else return s2; }
				));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); // CompareString�� Apply�κ��� ȣ���̵Ǹ鼭 �����ϰԵ�
		System.out.println(str);
	}

}
