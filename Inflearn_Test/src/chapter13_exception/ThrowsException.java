package chapter13_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException
	{ // 여기서 throws를 해서 예외처리를 미뤘기때문에 밑 main에서 try-catch문을 통해 처리
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className); // 클래스의 이름을 받아 c에 저장
		return c; // c반환
	}
	
	public static void main(String[] args) {
		
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
