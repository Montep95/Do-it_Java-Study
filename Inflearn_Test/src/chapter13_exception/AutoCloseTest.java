package chapter13_exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		//AutoCloseObj obj = new AutoCloseObj();
		// �ڹ� 10 �̻�(����ȭ)������ try()���� �� �����߾���ϴ� ���� �����ؼ� �� �� �ְ� �� = try(obj)
		try(AutoCloseObj obj = new AutoCloseObj())
		{
			throw new Exception();
		}catch(Exception e) {
			System.out.println("����ó���Ϸ� (Exception)");
		}
	}

}
