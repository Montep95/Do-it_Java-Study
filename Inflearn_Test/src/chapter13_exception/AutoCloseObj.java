package chapter13_exception;

public class AutoCloseObj implements AutoCloseable {// AutoCloseable을 구현하여 자동 리소스 해제가 되게 만듦
													// AutoCloseable이 구현된 클래스는 finally에서 close를 처리하지 않아도됨

	@Override
	public void close() throws Exception {
		System.out.println("close()"); // close()가 호출되었음을 명시적으로 보여줌
	} 
	

}
