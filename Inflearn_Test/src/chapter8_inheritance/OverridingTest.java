package chapter8_inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		/*
		Customer customerLee = new Customer(100010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, " + customerLee.showCustomerInfo());
	
		VIPCustomer customerKim = new VIPCustomer(100010, "KIM", 100); // VIPCustomer에서만 agentID가 정의되어있으므로..
		price = customerKim.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, " + customerKim.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(100010, "Who", 100); // VIPCustomer는 Customer를 내포하고있으므로 가능.
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, " + customerWho.showCustomerInfo());
		// 출력해보면 VIPCustomer 메서드가 불려지므로 "가상함수" = "가상메서드"
		
		Customer customerGold = new GoldCustomer(100020, "NOH");
	}

}
