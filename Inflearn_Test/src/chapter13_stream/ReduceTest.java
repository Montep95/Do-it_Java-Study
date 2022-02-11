package chapter13_stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) { // String으로 넘어온 이유는 위의 BinaryOperator에서 String으로 지정해주었기때문
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요", "저는", "자바", "개발자입니다."}; // 4개의 element
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			
						if(s1.getBytes().length >= s2.getBytes().length)
								return s1;
						else return s2; }
				));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); // CompareString의 Apply부분이 호출이되면서 연산하게됨
		System.out.println(str);
	}

}
