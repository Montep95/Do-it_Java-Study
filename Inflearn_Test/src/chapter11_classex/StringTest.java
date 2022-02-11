package chapter11_classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//=============== Constructor정보 가져오기 예제 ===============//
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c : cons)
		{
			System.out.println(c);
		}
		
		//=============== Field정보 가져오기 예제 ===============//
		Field[] fields = strClass.getFields(); 
		
		for(Field f : fields)
		{
			System.out.println(f);
		}
		
		//=============== Method정보 가져오기 예제 ===============//
		Method[] methods = strClass.getMethods(); 
		
		for(Method m : methods)
		{
			System.out.println(m);
		}
		
	}

}
