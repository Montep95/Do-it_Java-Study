package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJames = new Student(100, "James");
		
		// �̷��� ���⼭ "����"��� set�ϴ� �ͺ��� 
		// korea = new Subject("����"); ó�� �ϴ� ���� �ո����� �ڵ�
		
		studentJames.setkorea("����",  100);
		studentJames.setmath("����",  80);
		studentJames.seteng("����",  90);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setkorea("����",  70);
		studentTomas.setmath("����",  90);
		studentTomas.seteng("����",  100);
		
		studentJames.showStudnetInfo();
		studentTomas.showStudnetInfo();
		
	}

}
