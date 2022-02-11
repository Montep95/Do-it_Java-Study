package chapter2;


public class SwitchCase {

	public static void main(String[] args) {
		int month = 2;
		int day = 0;
		
		switch (month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
			
		case 2:
			day = 28;
			break;
			
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		}
		
		System.out.println("입력한 " + month +"월 달의 날은 총 " + day + "일 입니다.");
	}

}
