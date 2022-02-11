package hiding;
// 정보은닉 예제입니다.
// private 접근제어자 사용

class Birthday 
{
	
	private int day;
	private int month;
	private int year;
	
	// 이렇게 Setters and Getters로 생성해주면. 위의 변수들은 숨겨져있지만
	// 메서드를 이용해서 사용이 가능하다.
	public int getDay() {
		return day;
	}
	public void setDay(int day)
	{
		if(month ==2) // 2월의 경우 28일 넘어가는 경우나 1일보다 작은 경우의 예외를 지정해준다.
		{
			if (day < 1 || day > 28)
			{
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;	
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	
	// 만약 밑의 setYear가 구현이 되지 않으면, getYear만 가능하므로 read only가 되는 것임.
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}

public class BirthdayTest
{
	public static void main(String[] args)
	{
		Birthday day = new Birthday();
		// 지금은 int day; 이런식으로 사용이 가능하지만.
		// private int day;로 지정한다면 사용이 불가능하다.
		// 이럴경우 source-> Generate Setter and Getters 로 생성해주어야한다.
		// 대신 위의 선언한대로 day.setMonth(2)등으로 지정해주어야한다.

		// 이처럼 int day가 아닌 private int day처럼 써주게되면
		// public으로된 메서드들을 따로 지정이 가능해 if문을 넣는 등 다양한 활용이 가능하다.
		// public으로 모두 공개된 변수일 경우 무결성이 침범당할 수 있지만
		// private으로 은닉을 해놓고 public 메서드를 이용해 사용할수도 있다.
		
		day.setDay(8);
		day.setMonth(2);
		day.setYear(2021);
		
		/*
		 * day.month = 12;
		 * day.year = 2021;
		 * day.day = 8;
		 */
		
	}
	
}
