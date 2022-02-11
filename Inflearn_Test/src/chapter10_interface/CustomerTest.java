package chapter10_interface;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.Buy();
		
		Sell seller = customer;
		seller.Sell();
		
		customer.order(); // Customer에서 재정의했으므로 고객 판매 주문 (오버라이드)가 출력됨.
		buyer.order();    // Buy에 있는 것이 불릴거라 예상되겠지만 자바는 가상메서드 방식이므로
						 // 결국 인스턴스의 메서드가 불리므로 인스턴스의 메서드는
						 //오버라이딩된 메서드가 불리게 된다.
		
		seller.order(); // Sell도 마찬가지로 오버라이딩된 메서드가 불리게 되므로 3개의 order()모두 "고객 판매 주문 (오버라이드)"가 출력된다.
		
	}

}
