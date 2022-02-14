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
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){ // default�� false ������ true�� �ְԵǸ� ���ڿ��� append�Ǿ ABCABCó�� �پ� ����̵�
																			// false�� �����
			fos.write(bs);
			// output2.txt�� ABC~~~~XYZ ����
			
			fos.write(bs, 2, 10);// ABC(2��°)
			// C���� 10���� ���.
			
			/*
			fos.write(65); // �ƽ�Ű�ڵ� �� = A
			fos.write(66); // �ƽ�Ű�ڵ� �� = B
			fos.write(67); // �ƽ�Ű�ڵ� �� = C
			
			// output.txt �� ABC ����
			*/
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
