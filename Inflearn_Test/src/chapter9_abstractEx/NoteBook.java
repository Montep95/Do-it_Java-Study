package chapter9_abstractEx;

public abstract class NoteBook extends Computer { // Computer의 추상메서드들을

	@Override
	public void display() { // 하위 메서드에서 구현을 하여라.
		System.out.println("NoteBook Display().");
	}
	
	public void aaa() {};

}
