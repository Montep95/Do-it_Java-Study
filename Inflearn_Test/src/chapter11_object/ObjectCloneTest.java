package chapter11_object;

class Point
{
	int x, y;
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "x = " + x + ", " + "y = " + y;
	}
}

class Circle implements Cloneable
{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) // 생성자
	{
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString()
	{
		return "원점은 " + this.point + "이고, 반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone(); // 오류 = (Circle)circle.clone()처럼 해주어 강제로 다운캐스팅 해주겠다는 의미.
	
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle)); // 두개가 같은지 테스트 = 오류남 >> class Circle 에 implements Cloneable을 추가
		
		System.out.println(circle);
		System.out.println(cloneCircle); // implements Cloneable 추가후 같은지 다시 테스트 = 같음. (복제가 된 것)
	}

}
