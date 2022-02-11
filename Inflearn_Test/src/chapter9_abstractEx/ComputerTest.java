package chapter9_abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer(); // 오류 = Computer라는 클래스는 추상클래스이므로 오류.
		// c1.display(); = 생성될 수 없음
		
		Computer c2 = new DeskTop(); // 오류가 나지 않음
//		Computer c3 = new NoteBook(); // 오류 = abstract메서드를 포함하고 있는 추상클래스이므로 오류
		Computer c4 = new MyNoteBook(); // 오류가 나지 않음
//		NoteBook c5 = new MyNoteBook(); // 가능 = 상위클래스인 NoteBook에서 내포된 기능 가져오는 MyNotebook이므로.

		c2.display();
		c4.display();
	}

}
