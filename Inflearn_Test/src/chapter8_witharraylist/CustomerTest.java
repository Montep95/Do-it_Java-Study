package chapter8_witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// 이렇게하면 Customer에서 상속받은 모든 종류의 객체들이 customerList에 들어갈 수 있게된다.
		
		Customer cusomterLee = new Customer(10010, "이순신");
		Customer cusomterShin = new Customer(10011, "신사임당");
		GoldCustomer cusomterNoh = new GoldCustomer(10012, "노이킴");
		GoldCustomer cusomterHong = new GoldCustomer(10013, "홍길동");
		VIPCustomer cusomterKim = new VIPCustomer(10014, "김유신", 12345);
		
		customerList.add(cusomterLee);
		customerList.add(cusomterShin);
		customerList.add(cusomterNoh);
		customerList.add(cusomterHong);
		customerList.add(cusomterKim);
		
		System.out.println("======= 고객정보 출력 =======");
		for(Customer customer : customerList)
		{
			System.out.println(customer.showCustomerInfo());
		}
		/////////////////////////////////////////////////////////////
		System.out.println("======= 할인율과 보너스 포인트 결과 =======");
		int price = 10000;
		for(Customer customer : customerList)
		{
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
			System.out.println();
		}
	}

}
