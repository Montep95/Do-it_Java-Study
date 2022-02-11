package this_ex;

class Birthday
{
	int day;
	int month;
	int year;
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public void printThis()
	{
		System.out.println(this);
	}
}

public class This_example {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1); // 이 값과
		b1.printThis();			// 이 값이 같은 것을 알 수 있음 (this는 자기 자신의 메모리를 가리킴을 알 수 있음)
		
		System.out.println(b2);
		b2.printThis();
	}

}
