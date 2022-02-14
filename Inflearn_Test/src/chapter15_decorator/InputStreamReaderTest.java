package chapter15_decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader irs = new InputStreamReader (new FileInputStream("reader.txt")) ){ // new 안에 new를 써준 예제
		// try (FileInputStream fis = new FileInputStream("reader.txt")){
			// FileInputStream 사용시 특수문자들만 출력됨(한글출력시 깨지는 현상)
			
			int  i =  0;
			while((i=irs.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
