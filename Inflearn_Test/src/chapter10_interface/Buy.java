package chapter10_interface;

public interface Buy {
	void Buy();
	
	default void order()
	{
		System.out.println("���� �ֹ�");
	}
}
