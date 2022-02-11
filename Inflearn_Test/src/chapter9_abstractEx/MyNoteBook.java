package chapter9_abstractEx;

public class MyNoteBook extends NoteBook
{
	@Override
	public void typing() { // 하위 메서드에서 구현을 하여라.
		System.out.println("MyNoteBook typing().");
	}

}
