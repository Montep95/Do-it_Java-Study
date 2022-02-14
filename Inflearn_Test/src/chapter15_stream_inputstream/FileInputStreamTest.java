package chapter15_stream_inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null; // �ѱ� ��½� FileReader �ַ� ���
		int i = 0;
		
		try {
			fis = new FileInputStream("input.txt");
			// ���ڴ� FileInputStream ���� FileReader�������� ���� ���ڵ� ��� �����Ƿ�
			// �ѱ��� �ᵵ ���� �� ����
			
			while( (i = fis.read()) != -1) {//�������϶�����
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
