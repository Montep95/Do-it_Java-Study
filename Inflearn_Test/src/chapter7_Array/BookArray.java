package chapter7_Array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // �� ���� å�� �� ������� ���ε�, å�� ����ų �ּҰ� 5���� ��������ٴ� ���̴�.
										// ���� �ڷ�ũ��(ex.4����Ʈ)�� �������� �ʰ� null������ �����Ǿ������Ƿ� �Ŀ� �߰����ش�.
										// �ᱹ �ּҰ��� �ǹ��ϴ� ���̴�.
		
		// int[] library = new int[5]; // int=4����Ʈ�� 20����Ʈ�� �� �������� ��������� ���̰�
		
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("������", "������");
		library[2] = new Book("�ҹ���", "������");
		library[3] = new Book("�����", "�������丮");
		library[4] = new Book("����", "�ڰ渮");
		
		for(int i = 0; i < library.length; i++)
		{
			System.out.println(library[i]); // ���� �ּҰ��� ����̵�.
		}
		
		for(int i = 0; i < library.length; i++)
		{
			library[i].showBookInfo(); // ��� �޼��带 �̹� ���������Ƿ� �̷��� ������ָ��.
		}
		
		
	}

}
