package chapter10_interface;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.Buy();
		
		Sell seller = customer;
		seller.Sell();
		
		customer.order(); // Customer���� �����������Ƿ� �� �Ǹ� �ֹ� (�������̵�)�� ��µ�.
		buyer.order();    // Buy�� �ִ� ���� �Ҹ��Ŷ� ����ǰ����� �ڹٴ� ����޼��� ����̹Ƿ�
						 // �ᱹ �ν��Ͻ��� �޼��尡 �Ҹ��Ƿ� �ν��Ͻ��� �޼����
						 //�������̵��� �޼��尡 �Ҹ��� �ȴ�.
		
		seller.order(); // Sell�� ���������� �������̵��� �޼��尡 �Ҹ��� �ǹǷ� 3���� order()��� "�� �Ǹ� �ֹ� (�������̵�)"�� ��µȴ�.
		
	}

}
