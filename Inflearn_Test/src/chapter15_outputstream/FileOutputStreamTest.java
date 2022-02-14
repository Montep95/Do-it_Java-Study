package chapter15_outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i =0; i < bs.length; i++)
		{
			bs[i] = data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){ // default는 false 이지만 true로 주게되면 문자열이 append되어서 ABCABC처럼 붙어 출력이됨
																			// false는 덮어쓰기
			fos.write(bs);
			// output2.txt에 ABC~~~~XYZ 저장
			
			fos.write(bs, 2, 10);// ABC(2번째)
			// C부터 10개만 써라.
			
			/*
			fos.write(65); // 아스키코드 값 = A
			fos.write(66); // 아스키코드 값 = B
			fos.write(67); // 아스키코드 값 = C
			
			// output.txt 에 ABC 저장
			*/
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
