package chapter10_interface;

public class MyClass implements Myinterface{

	// 결국 Myinterface는 X,Y를 포함하기때문에 MyClass에서 구현해야 할 것은 3개가 된다.
	@Override
	public void X() { // X의 메서드 
		System.out.println("x()");
	}

	@Override
	public void Y() { // Y의 메서드
		System.out.println("y()");		
	}

	@Override
	public void myMethod() { // Myinterface의 메서드
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args)
	{
		MyClass myClass = new MyClass();
		
		X xClass = myClass;
		
		xClass.X();
	}

}
