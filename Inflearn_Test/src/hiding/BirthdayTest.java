package hiding;
// �������� �����Դϴ�.
// private ���������� ���

class Birthday 
{
	
	private int day;
	private int month;
	private int year;
	
	// �̷��� Setters and Getters�� �������ָ�. ���� �������� ������������
	// �޼��带 �̿��ؼ� ����� �����ϴ�.
	public int getDay() {
		return day;
	}
	public void setDay(int day)
	{
		if(month ==2) // 2���� ��� 28�� �Ѿ�� ��쳪 1�Ϻ��� ���� ����� ���ܸ� �������ش�.
		{
			if (day < 1 || day > 28)
			{
				System.out.println("��¥ �����Դϴ�.");
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
	
	// ���� ���� setYear�� ������ ���� ������, getYear�� �����ϹǷ� read only�� �Ǵ� ����.
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}

public class BirthdayTest
{
	public static void main(String[] args)
	{
		Birthday day = new Birthday();
		// ������ int day; �̷������� ����� ����������.
		// private int day;�� �����Ѵٸ� ����� �Ұ����ϴ�.
		// �̷���� source-> Generate Setter and Getters �� �������־���Ѵ�.
		// ��� ���� �����Ѵ�� day.setMonth(2)������ �������־���Ѵ�.

		// ��ó�� int day�� �ƴ� private int dayó�� ���ְԵǸ�
		// public���ε� �޼������ ���� ������ ������ if���� �ִ� �� �پ��� Ȱ���� �����ϴ�.
		// public���� ��� ������ ������ ��� ���Ἲ�� ħ������ �� ������
		// private���� ������ �س��� public �޼��带 �̿��� ����Ҽ��� �ִ�.
		
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
