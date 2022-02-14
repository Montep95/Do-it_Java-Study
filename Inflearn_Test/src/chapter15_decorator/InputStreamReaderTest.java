package chapter15_decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader irs = new InputStreamReader (new FileInputStream("reader.txt")) ){ // new �ȿ� new�� ���� ����
		// try (FileInputStream fis = new FileInputStream("reader.txt")){
			// FileInputStream ���� Ư�����ڵ鸸 ��µ�(�ѱ���½� ������ ����)
			
			int  i =  0;
			while((i=irs.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
