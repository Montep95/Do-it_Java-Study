package chapter13_lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y)? x : y; 
		// MyNumber 인터페이스로부터 x, y의 두 매개변수를 받아 x가 y보다 크거나 같으면 x를 maxNum(큰 값)에 넣고
		// 그게 아니면 y를 maxNum(큰 값)에 넣는다.
		
		int max = maxNum.getMaxNumber(10, 20); // maxNum이라는 선언된 변수가 getMaxNumber를 호출하여 연산된다.
		System.out.println(max);
	}

}
