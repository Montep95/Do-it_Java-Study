package chapter13_exception;

public class IDFormatException extends Exception{
	
	// ���� - ���̵��� null or 8����, 20�� �̻��� ��� ���� �߻�
	public IDFormatException(String message)
	{
		super(message);
	}

}
