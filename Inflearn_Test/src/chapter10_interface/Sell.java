package chapter10_interface;

public interface Sell {
	void Sell();
	
	default void order()
	{
		System.out.println("�Ǹ� �ֹ�");
	}
}
