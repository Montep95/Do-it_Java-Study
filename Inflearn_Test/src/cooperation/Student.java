package cooperation;

public class Student {
	int grade;
	int money;
	String studentName;
	
	public Student(String studentName, int money)
	{
		this.studentName = studentName;
		this.money = money;
	}
	
	// ��ü���� ���� (�̹� ������ �ٽɺκ�), �ٸ� Ŭ������ ������ �ִ� ��.
	public void takeBus(Bus bus) // ������ ���� ������ �Ű������� �޾ƿ´�. bus�� ��ü�̴�.
	{
		bus.take(1000); // ������� Ŭ������ 1000���� �����ϴ� �� 
		money -= 1000; // 1000���� �Һ�ȴ�.
	}
	
	// ��ü���� ���� (�̹� ������ �ٽɺκ�), �ٸ� Ŭ������ ������ �ִ� ��.
	public void takeSubway(Subway subway) // ����ö�� ���� ������ �Ű������� �޾ƿ´�. Subway�� ��ü�̴�.
	{
		subway.take(1500); // ����ö Ŭ������ 1500���� �����ϴ� �� 
		money -= 1500; // 1500���� �Һ�ȴ�.
	}
	
	public void showInfo()
	{
		System.out.println(studentName + "���� ���� �ܾ��� " + money + "�� �Դϴ�.");
	}

}
