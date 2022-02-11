package chapter7_Array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // 이 경우는 책이 곧 만들어질 것인데, 책이 가리킬 주소가 5개가 만들어진다는 뜻이다.
										// 실제 자료크기(ex.4바이트)가 지정되지 않고 null값으로 지정되어있으므로 후에 추가해준다.
										// 결국 주소값을 의미하는 것이다.
		
		// int[] library = new int[5]; // int=4바이트로 20바이트가 딱 정해져서 만들어지는 것이고
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("동백산맥", "조정래");
		library[2] = new Book("소백산맥", "조정래");
		library[3] = new Book("어린왕자", "생택쥐페리");
		library[4] = new Book("토지", "박경리");
		
		for(int i = 0; i < library.length; i++)
		{
			System.out.println(library[i]); // 단지 주소값만 출력이됨.
		}
		
		for(int i = 0; i < library.length; i++)
		{
			library[i].showBookInfo(); // 출력 메서드를 이미 만들어놨으므로 이렇게 출력해주면됨.
		}
		
		
	}

}
