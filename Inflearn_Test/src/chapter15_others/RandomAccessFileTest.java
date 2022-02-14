package chapter15_others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // "rw" = read, write �������� �������� ����
		rf.writeInt(100); // 4
		System.out.println(rf.getFilePointer());
	
		rf.writeDouble(3.14); // 8
		System.out.println(rf.getFilePointer());
	
		rf.writeUTF("�ȳ��ϼ���"); // 3*5 (+2) = 17 // +2�� String �ڿ� null����Ʈ�� ���⶧��
		System.out.println(rf.getFilePointer()); // 25�� ��µ� �ѱ� �ϳ� �� 3����Ʈ�� ��
	
		rf.seek(0); // ���������Ͱ� �� ������ ���� = 0
					// ���������� �̵� �޼���
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);

	}
	

}
