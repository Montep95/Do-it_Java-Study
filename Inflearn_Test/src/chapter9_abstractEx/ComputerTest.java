package chapter9_abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer(); // ���� = Computer��� Ŭ������ �߻�Ŭ�����̹Ƿ� ����.
		// c1.display(); = ������ �� ����
		
		Computer c2 = new DeskTop(); // ������ ���� ����
//		Computer c3 = new NoteBook(); // ���� = abstract�޼��带 �����ϰ� �ִ� �߻�Ŭ�����̹Ƿ� ����
		Computer c4 = new MyNoteBook(); // ������ ���� ����
//		NoteBook c5 = new MyNoteBook(); // ���� = ����Ŭ������ NoteBook���� ������ ��� �������� MyNotebook�̹Ƿ�.

		c2.display();
		c4.display();
	}

}
