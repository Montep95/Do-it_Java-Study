package chapter13_exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		//AutoCloseObj obj = new AutoCloseObj();
		// 자바 10 이상(유료화)에서는 try()문에 꼭 선언했어야하는 것이 참조해서 쓸 수 있게 됨 = try(obj)
		try(AutoCloseObj obj = new AutoCloseObj())
		{
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외처리완료 (Exception)");
		}
	}

}
