package chapter11_string;


public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2); // 다르다고나옴, new로 생성된 두 객체의 주소값은 다르다는 이야기.
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // 같다고나옴, 상수 풀로 선언된 주소값을 참조하므로 같은 주소값을 바라봄.
		
		// ===========문자열 연결 예제============ // 본래 String 은 final로 구현된 byte[]객체이므로 바뀔 수 없지만 응용하는 예제
		String str5 = new String("java");
		String str6 = new String("android");
		
		str5 = str5.concat(str6);
		System.out.println(str5); // str5에 str6이 붙은게 아니고 java와 android를 연결하는 새로운 메모리가 생성되고 그 문자열을 가리키게 되는 것임 (실제로 연결된게 아니라는 뜻)
		
		// ===========문자열 연결 "확인"예제============ //
		String str7 = new String("java");
		String str8 = new String("android");
		
		System.out.println(System.identityHashCode(str7)); // 처음 문자열 주소 값
		
		str7 = str7.concat(str8);
		System.out.println(str7); // str5에 str6이 붙은게 아니고 java와 android를 연결하는 새로운 메모리가 생성되고 그 문자열을 가리키게 되는 것임 (실제로 연결된게 아니라는 뜻)
		
		System.out.println(System.identityHashCode(str7)); // 나중 문자열 주소 값
		
		// >> 주로 StringBuilder, StringBuffer를 사용함
	}

}
