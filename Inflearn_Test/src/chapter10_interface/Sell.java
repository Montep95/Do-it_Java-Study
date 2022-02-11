package chapter10_interface;

public interface Sell {
	void Sell();
	
	default void order()
	{
		System.out.println("판매 주문");
	}
}
