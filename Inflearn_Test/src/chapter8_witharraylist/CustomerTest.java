package chapter8_witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// �̷����ϸ� Customer���� ��ӹ��� ��� ������ ��ü���� customerList�� �� �� �ְԵȴ�.
		
		Customer cusomterLee = new Customer(10010, "�̼���");
		Customer cusomterShin = new Customer(10011, "�Ż��Ӵ�");
		GoldCustomer cusomterNoh = new GoldCustomer(10012, "����Ŵ");
		GoldCustomer cusomterHong = new GoldCustomer(10013, "ȫ�浿");
		VIPCustomer cusomterKim = new VIPCustomer(10014, "������", 12345);
		
		customerList.add(cusomterLee);
		customerList.add(cusomterShin);
		customerList.add(cusomterNoh);
		customerList.add(cusomterHong);
		customerList.add(cusomterKim);
		
		System.out.println("======= ������ ��� =======");
		for(Customer customer : customerList)
		{
			System.out.println(customer.showCustomerInfo());
		}
		/////////////////////////////////////////////////////////////
		System.out.println("======= �������� ���ʽ� ����Ʈ ��� =======");
		int price = 10000;
		for(Customer customer : customerList)
		{
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "���� �����ϼ̽��ϴ�.");
			System.out.println(customer.showCustomerInfo());
			System.out.println();
		}
	}

}
