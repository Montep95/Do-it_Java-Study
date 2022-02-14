package chapter15_stream_inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		/* 알파벳 한개 입력받는 예제 
		System.out.println("알파벳 하나를 쓰고 엔터를 누르세요 = ");
		
		int i = 0;
		
		try {
			i  =System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력해주신 문자는 = " + ((char)i) + " 입니다.");
		// char()로 문자열 처리를 해주어야함
		// d 를 그냥 출력하면 100
		 * 
		 */
		
		// 알파벳 여러개를 입력받는 예제 
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요 = ");
		
		int i = 0;
		
		try {
			while((i  =System.in.read()) != '\n') {
				System.out.println("입력해주신 문자는 = " + ((char)i) + " 입니다.");
			};
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
