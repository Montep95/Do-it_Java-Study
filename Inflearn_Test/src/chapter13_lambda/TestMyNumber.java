package chapter13_lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y)? x : y; 
		// MyNumber �������̽��κ��� x, y�� �� �Ű������� �޾� x�� y���� ũ�ų� ������ x�� maxNum(ū ��)�� �ְ�
		// �װ� �ƴϸ� y�� maxNum(ū ��)�� �ִ´�.
		
		int max = maxNum.getMaxNumber(10, 20); // maxNum�̶�� ����� ������ getMaxNumber�� ȣ���Ͽ� ����ȴ�.
		System.out.println(max);
	}

}
