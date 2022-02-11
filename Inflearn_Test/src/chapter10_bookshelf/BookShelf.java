package chapter10_bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // remove함수 요소는 인덱스인데 0이므로 가장 첫번째값을 제거함을 의미.
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
