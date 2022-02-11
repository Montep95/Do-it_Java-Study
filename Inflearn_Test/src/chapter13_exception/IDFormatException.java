package chapter13_exception;

public class IDFormatException extends Exception{
	
	// 예제 - 아이디값이 null or 8이하, 20자 이상인 경우 예외 발생
	public IDFormatException(String message)
	{
		super(message);
	}

}
