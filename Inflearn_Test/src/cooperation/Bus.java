package cooperation;

public class Bus {
	int busNumber; // ������ȣ
	int passengerCount; // �°� ��
	int money; // ��
	
	public Bus(int busNumber) //��� ������ ��ȣ�� �������Ѵ�. (�⺻������ ����)
	{
		this.busNumber = busNumber;
	}
	
	public void take(int money) // �°��� �¿�
	{
		passengerCount++;
		this.money += money; //���� �Ű������� �޾����Ƿ�, ������ŭ ���� �����ؾ��ؼ� += money�� �����Ѵ�.
	}
	
	public void showInfo()
	{
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ���� ������ "
				+ money + "�� �Դϴ�.");
	}

}
