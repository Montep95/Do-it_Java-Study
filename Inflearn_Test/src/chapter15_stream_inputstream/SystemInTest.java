package chapter15_stream_inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		/* ���ĺ� �Ѱ� �Է¹޴� ���� 
		System.out.println("���ĺ� �ϳ��� ���� ���͸� �������� = ");
		
		int i = 0;
		
		try {
			i  =System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�Է����ֽ� ���ڴ� = " + ((char)i) + " �Դϴ�.");
		// char()�� ���ڿ� ó���� ���־����
		// d �� �׳� ����ϸ� 100
		 * 
		 */
		
		// ���ĺ� �������� �Է¹޴� ���� 
		System.out.println("���ĺ� �������� ���� ���͸� �������� = ");
		
		int i = 0;
		
		try {
			while((i  =System.in.read()) != '\n') {
				System.out.println("�Է����ֽ� ���ڴ� = " + ((char)i) + " �Դϴ�.");
			};
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
