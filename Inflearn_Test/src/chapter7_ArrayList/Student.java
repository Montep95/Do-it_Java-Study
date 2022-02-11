package chapter7_ArrayList;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; // �� �л��� ���� ���������� �迭�� �������.
	
	public Student(int studentID, String studentName) // �л��� ���� �⺻ �޼���
	{
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // ���Ӱ� ���� �迭�� ����
	}
	
	public void addSubject(String name, int score) // ������ �߰��ϴ� �޼���
	{
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() // �л��� �л��� ������ ���� ��� �޼���
	{
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			
			System.out.println("�л� " + studentName + "���� " + subject.getName() + " ������ ������ = "
					+ subject.getScore() + "�� �Դϴ�.");
		}
		
		System.out.println("�л� " + studentName + "���� ������ " + total + "�� �Դϴ�.");
	}
	
}

