package reference;

public class Circle 
{
	Point point; // Point 클래스에서 x,y 생성한 것을 참조함 (참조변수 객체를 가져옴)
	int radius;
	
	public Circle()
	{
		point = new Point(); // 위에서 Point point 를 이미 해줬으므로
							// Point point = new Point();로 써주지 않는 것임.
	}

}
