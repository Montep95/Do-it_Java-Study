package chapter13_exception;

public class AutoCloseObj implements AutoCloseable {// AutoCloseable�� �����Ͽ� �ڵ� ���ҽ� ������ �ǰ� ����
													// AutoCloseable�� ������ Ŭ������ finally���� close�� ó������ �ʾƵ���

	@Override
	public void close() throws Exception {
		System.out.println("close()"); // close()�� ȣ��Ǿ����� ��������� ������
	} 
	

}
