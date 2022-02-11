package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJames = new Student(100, "James");
		
		// 이렇게 여기서 "국어"라고 set하는 것보단 
		// korea = new Subject("국어"); 처럼 하는 것이 합리적인 코드
		
		studentJames.setkorea("국어",  100);
		studentJames.setmath("수학",  80);
		studentJames.seteng("영어",  90);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setkorea("국어",  70);
		studentTomas.setmath("수학",  90);
		studentTomas.seteng("영어",  100);
		
		studentJames.showStudnetInfo();
		studentTomas.showStudnetInfo();
		
	}

}
