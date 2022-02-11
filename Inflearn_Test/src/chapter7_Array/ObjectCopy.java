package chapter7_Array;

public class ObjectCopy { // 얕은 복사 예제

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
	
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i= 0; i < bookArray2.length; i++)
		{
			bookArray2[i].showBookInfo(); // 잘 복사된 것을 확인 가능
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i= 0; i < bookArray1.length; i++)
		{
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=============");
		for(int i= 0; i < bookArray2.length; i++)
		{
			bookArray2[i].showBookInfo(); // bookArray1가 수정됨에 따라 bookArray2도 바뀐것을 확인 가능.
										// 애초에 복사는 주소값을 복사하는 것이기때문에 수정되는 값이 출력된다.
		}
	}

}
