package chapter15_decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.write(100); // 한 바이트를 쓰는 것
			dos.writeInt(10);
			dos.writeChar('A');
			dos.writeUTF("hello"); // 스트링 쓰는 것 UTF
		
		}catch(IOException e){
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		
		}catch(IOException e){
			System.out.println(e);
		}
		
	}

}
