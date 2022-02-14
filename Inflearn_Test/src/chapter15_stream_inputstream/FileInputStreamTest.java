package chapter15_stream_inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null; // 한글 출력시 FileReader 주로 사용
		int i = 0;
		
		try {
			fis = new FileInputStream("input.txt");
			// 문자는 FileInputStream 보다 FileReader로읽으면 문자 인코딩 대로 읽으므로
			// 한글을 써도 읽을 수 있음
			
			while( (i = fis.read()) != -1) {//끝지점일때까지
				System.out.print((char)i);
			}; 
			/*
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			*/
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
				
			}catch (IOException e) {
				System.out.println(e);
			}		
		}
		System.out.println("end");
	}

}
