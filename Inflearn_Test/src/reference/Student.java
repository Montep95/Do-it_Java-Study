package reference;

public class Student {
	
	int StudentID;
	String studentName;
	
	/* Subject.java Ŭ�������� �����Ͽ��⶧���� �л�Ŭ������ �����ؼ� �������� �ʿ����.
	int koreaScore;
	int mathScore;
	int engScore;
	
	String koreaSubject;
	String mathSubject;
	String engSubject;
	*/
	
	// Subject�� �����̸��� ������ ��������.
	Subject korea;
	Subject math;
	Subject eng;
	// �̷��Ը� ���༭�� ���Ұ�.
	
	public Student()
	{
		// �̷��� ����� ���񿡴��� �ν��Ͻ����� '��μ�'������ �� �ִ°�
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public Student(int id, String name)
	{
		StudentID = id;
		studentName = name; // String studentName;���� ���� new��� ���� �Ƚᵵ�Ǵµ�, �̴� JDK���� �����ϴ�
							// Ư���� ������ ������ ����. ���߿� ������ ��.
		
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public void setkorea(String name, int score)
	{
		korea.setSubjectName(name); // korea�� Subject�� �����Ǿ����Ƿ� Subject Ŭ������ setSubjectName �̶�� �޼��带 ȣ���Ͽ� �ٲ�
		korea.setScore(score);
	}
	
	public void setmath(String name, int score)
	{
		math.setSubjectName(name); // math�� Subject�� �����Ǿ����Ƿ� Subject Ŭ������ setSubjectName �̶�� �޼��带 ȣ���Ͽ� �ٲ�
		math.setScore(score);
	}
	
	public void seteng(String name, int score)
	{
		eng.setSubjectName(name); // eng�� Subject�� �����Ǿ����Ƿ� Subject Ŭ������ setSubjectName �̶�� �޼��带 ȣ���Ͽ� �ٲ�
		eng.setScore(score);
	}
	
	public void showStudnetInfo()
	{
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	}
}
