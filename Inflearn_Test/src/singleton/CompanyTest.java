package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		// Company c3 = new Company(); // error
		
		System.out.println(c1);
		System.out.println(c2); // 동일한 값이 나옴을 확인 가능.
		// 싱글톤 패턴이므로 c1,c2의 주소값은 같게나옴 Company클래스에서 딱 하나 instance로 생성되었기때문에.
		
		System.out.println(c1 == c2); // true
		
		Calendar cal = Calendar.getInstance(); // import Calendar로 되어야함. 
											   // 캘린더처럼 날짜,시간에서도 쓰임을 확인해주는 코드
		
		
		
	}

}
