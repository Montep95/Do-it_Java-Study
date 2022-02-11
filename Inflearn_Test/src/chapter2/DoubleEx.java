package chapter2;

public class DoubleEx {
	
	int abc;

	public static void main(String[] args) {
		double dNum = 3.14; // 기본적 저장은 double값으로 저장됨.
		float fNum = 3.14F; // float 형의 경우 꼭 F를 뒤에 붙여줘야함
		
		/*
		 * 
		 * 자료형 없이 변수 사용하기위해선 (자바 10)
		 * 지역 변수 차료형 추론 사용
		 * " var "
		 * 한번 자료형을 선언하면 바꿀 수 없음
		 * var num = 10; -> var num = "Hello" (x)
		 * 대신 지역변수 사용이므로 위의 abc와 같은 변수에는 var을 사용할 수 없다!
		 */

		
		var num = 10;
		var num2 = 10.0;
		var str = "Hello";
		System.out.println("===테스트 값 출력===");
		System.out.println(dNum + " " + fNum);
		System.out.println(num + " " + num2 + " " + str);
		
	}

}
