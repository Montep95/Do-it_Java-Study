package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		// Company c3 = new Company(); // error
		
		System.out.println(c1);
		System.out.println(c2); // ������ ���� ������ Ȯ�� ����.
		// �̱��� �����̹Ƿ� c1,c2�� �ּҰ��� ���Գ��� CompanyŬ�������� �� �ϳ� instance�� �����Ǿ��⶧����.
		
		System.out.println(c1 == c2); // true
		
		Calendar cal = Calendar.getInstance(); // import Calendar�� �Ǿ����. 
											   // Ķ����ó�� ��¥,�ð������� ������ Ȯ�����ִ� �ڵ�
		
		
		
	}

}
