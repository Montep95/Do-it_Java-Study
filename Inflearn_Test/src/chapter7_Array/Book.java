package chapter7_Array;

public class Book {
	
	// 프라이빗이므로 외부에서 접근하려면 메서드가 있어야함
	// getter and setter를 추가해주면됨
	private String bookName;
	private String author;
	
	public Book() {} // 기본 생성자 지정
	
	public Book(String bookName, String author)
	{
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo()
	{
		System.out.println(bookName + " " + author);
	}
	
}
