package chapter11_string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1)); // 99~~~
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer)); // 38~~~
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer)); // 38~~~ 위와 같음
		
		String str2 = buffer.toString(); // 이 버퍼의 String을 호출해서 str2에 저장
		System.out.println(str2); // 출력하기 위해서 저장한 것이고 str2을 출력하면 java and android가 출력됨
		
	}

}
