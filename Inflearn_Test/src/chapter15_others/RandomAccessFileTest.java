package chapter15_others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // "rw" = read, write 버전으로 열겠음을 설정
		rf.writeInt(100); // 4
		System.out.println(rf.getFilePointer());
	
		rf.writeDouble(3.14); // 8
		System.out.println(rf.getFilePointer());
	
		rf.writeUTF("안녕하세요"); // 3*5 (+2) = 17 // +2는 String 뒤에 null포인트가 들어가기때문
		System.out.println(rf.getFilePointer()); // 25가 출력됨 한글 하나 당 3바이트를 씀
	
		rf.seek(0); // 파일포인터가 맨 앞으로 간다 = 0
					// 파일포인터 이동 메서드
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);

	}
	

}
