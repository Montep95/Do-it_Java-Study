package chapter13_lambda;

@FunctionalInterface 
public interface MyNumber {
	
	int getMaxNumber(int num1, int num2); // 매개변수가 2개인 변수
	//int testNumber(); // 매개변수가 없는 변수
	//int testNumber(int x, int y); // 이렇게되어버리면 매개변수가 2개인것이 겹치므로 "단 하나의 메서드만" 선언하는 것이 좋음
	
}
