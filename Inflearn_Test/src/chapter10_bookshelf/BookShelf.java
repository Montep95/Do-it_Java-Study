package chapter10_bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // remove�Լ� ��Ҵ� �ε����ε� 0�̹Ƿ� ���� ù��°���� �������� �ǹ�.
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
