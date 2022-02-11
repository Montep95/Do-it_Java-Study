package chapter7_ArrayList;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; // 이 학생이 들을 수강과목을 배열로 만들어줌.
	
	public Student(int studentID, String studentName) // 학생의 정보 기본 메서드
	{
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // 새롭게 과목 배열에 넣음
	}
	
	public void addSubject(String name, int score) // 과목을 추가하는 메서드
	{
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() // 학생과 학생이 수강한 정보 출력 메서드
	{
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			
			System.out.println("학생 " + studentName + "님의 " + subject.getName() + " 과목의 성적은 = "
					+ subject.getScore() + "점 입니다.");
		}
		
		System.out.println("학생 " + studentName + "님의 총점은 " + total + "점 입니다.");
	}
	
}

