package chapter10_interface;

public class MyClass implements Myinterface{

	// �ᱹ Myinterface�� X,Y�� �����ϱ⶧���� MyClass���� �����ؾ� �� ���� 3���� �ȴ�.
	@Override
	public void X() { // X�� �޼��� 
		System.out.println("x()");
	}

	@Override
	public void Y() { // Y�� �޼���
		System.out.println("y()");		
	}

	@Override
	public void myMethod() { // Myinterface�� �޼���
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args)
	{
		MyClass myClass = new MyClass();
		
		X xClass = myClass;
		
		xClass.X();
	}

}
