package chapter10_interface;

public class Customer implements Buy, Sell{

	@Override
	public void Sell() {
		
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void Buy() {
		
		System.out.println("�����ϱ�");
	}

	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ� (�������̵�=������)");
	}

}
