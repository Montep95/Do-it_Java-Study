package chapter8_inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		/*
		Customer customerLee = new Customer(100010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�� �̰�, " + customerLee.showCustomerInfo());
	
		VIPCustomer customerKim = new VIPCustomer(100010, "KIM", 100); // VIPCustomer������ agentID�� ���ǵǾ������Ƿ�..
		price = customerKim.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�� �̰�, " + customerKim.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(100010, "Who", 100); // VIPCustomer�� Customer�� �����ϰ������Ƿ� ����.
		int price = customerWho.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�� �̰�, " + customerWho.showCustomerInfo());
		// ����غ��� VIPCustomer �޼��尡 �ҷ����Ƿ� "�����Լ�" = "����޼���"
		
		Customer customerGold = new GoldCustomer(100020, "NOH");
	}

}
