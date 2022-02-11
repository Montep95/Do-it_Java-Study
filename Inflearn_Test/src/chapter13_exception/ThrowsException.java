package chapter13_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException
	{ // ���⼭ throws�� �ؼ� ����ó���� �̷�⶧���� �� main���� try-catch���� ���� ó��
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className); // Ŭ������ �̸��� �޾� c�� ����
		return c; // c��ȯ
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
