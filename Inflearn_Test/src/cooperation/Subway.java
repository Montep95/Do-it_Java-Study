package cooperation;

public class Subway {
	int lineNumber; // �뼱��ȣ
	int passengerCount; // �°� ��
	int money; // ��
	
	public Subway(int lineNumber) //��� ����ö�� �뼱�� �������Ѵ�. (�⺻������ ����)
	{
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) // �°��� �¿�
	{
		passengerCount++;
		this.money += money; //���� �Ű������� �޾����Ƿ�, ������ŭ ���� �����ؾ��ؼ� += money�� �����Ѵ�.
	}
	
	public void showInfo()
	{
		System.out.println("����ö " + lineNumber + "ȣ���� �°��� " + passengerCount + "���̰�, ����ö ������ "
				+ money + "�� �Դϴ�.");
	}

}
