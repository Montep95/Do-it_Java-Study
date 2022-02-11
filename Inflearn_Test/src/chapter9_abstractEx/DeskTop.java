package chapter9_abstractEx;

public class DeskTop extends Computer 
{
	@Override
	public void display() { // 하위 메서드에서 구현을 하여라.
		System.out.println("DeskTop Display().");

	}

	@Override
	public void typing() {
		System.out.println("DeskTop Display().");

	}
}
