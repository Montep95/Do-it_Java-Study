package reference;

public class Student {
	
	int StudentID;
	String studentName;
	
	/* Subject.java 클래스에서 정의하였기때문에 학생클래스에 무리해서 과적합할 필요없음.
	int koreaScore;
	int mathScore;
	int engScore;
	
	String koreaSubject;
	String mathSubject;
	String engSubject;
	*/
	
	// Subject의 과목이름을 가져와 생성해줌.
	Subject korea;
	Subject math;
	Subject eng;
	// 이렇게만 해줘서는 사용불가.
	
	public Student()
	{
		// 이렇게 해줘야 과목에대한 인스턴스들을 '비로소'생성할 수 있는것
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public Student(int id, String name)
	{
		StudentID = id;
		studentName = name; // String studentName;같은 경우는 new라는 예약어를 안써도되는데, 이는 JDK에서 제공하는
							// 특정한 문법에 한정된 것임. 나중에 설명할 것.
		
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public void setkorea(String name, int score)
	{
		korea.setSubjectName(name); // korea는 Subject로 생성되었으므로 Subject 클래스의 setSubjectName 이라는 메서드를 호출하여 바꿈
		korea.setScore(score);
	}
	
	public void setmath(String name, int score)
	{
		math.setSubjectName(name); // math는 Subject로 생성되었으므로 Subject 클래스의 setSubjectName 이라는 메서드를 호출하여 바꿈
		math.setScore(score);
	}
	
	public void seteng(String name, int score)
	{
		eng.setSubjectName(name); // eng는 Subject로 생성되었으므로 Subject 클래스의 setSubjectName 이라는 메서드를 호출하여 바꿈
		eng.setScore(score);
	}
	
	public void showStudnetInfo()
	{
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
