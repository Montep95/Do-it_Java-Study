package chapter8_inheritance;

public class Circle { // extends Point 처럼 사용하면 안된다. 일반적으로 상속은 구체적으로 활용하고자 쓰는데, 
						// Circle과 Point는 구체적이고 일반적인 관계가 아니라 그냥 가져다 쓰는 관계이기때문이다.
	
	Point point; // 이처럼 써주어 상속보다는 그 클래스것을 그대로 쓰겠다는 것을 선언해주어야함
	
	/*
	private int x;
	private int y;
	*/
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
	
}
