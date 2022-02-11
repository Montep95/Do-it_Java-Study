package chapter13_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class ExceptionTest {

	public static void main(String[] args) throws FileNotFoundException { // throws는 미루는 구문
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");	
		} catch (FileNotFoundException e){
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch (IOException e)
			{
				e.printStackTrace();
			}
			System.out.println("finally");	
		}
		System.out.println("end");
	}
}
