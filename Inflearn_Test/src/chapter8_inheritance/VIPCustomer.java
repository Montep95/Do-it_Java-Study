package chapter8_inheritance;

public class VIPCustomer extends Customer // ����� �ްڴ� ����. 
{
	
	/* �̺κж��� ��ӹ޾����Ƿ� �ʿ���� �κ�.
	protected int customerID;
	protected String customerName;
	protected String customerGrade;

	int bonusPoint;
	double bonusRatio; // ������ ó���ؾ��ϹǷ� double��
	*/
	
	// �Ϲݰ������� �ʿ���� �Ӽ�, VIP�� �Ӽ��̹Ƿ� ������� ó�����־���Ѵ�.
	double saleRatio;
	private int agentID;
	///////////////////////////
	
	public VIPCustomer()
	{
		// super(); // �ڱ��� �ٷ� �� ����Ŭ������ ȣ�� = Customer()�� ȣ���.
		// super(int customerID, String customerName) // �ڱ��� �ٷ� �� ����Ŭ������ ȣ�� = Customer(int customerID, String customerName)�� ȣ���.
		
		customerGrade = "VIP"; // Customer Ŭ�������� private���� �����ϸ� ���� �߻�.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		// System.out.println("VIPCustomer() ȣ��"); // ����Ŭ����ȣ�� �� ����Ŭ������ ȣ��Ǵ��� �˾ƺ������� ����
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);
		customerGrade = "VIP"; // Customer Ŭ�������� private���� �����ϸ� ���� �߻�.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		// System.out.println("VIPCustomer() ȣ��"); // ����Ŭ����ȣ�� �� ����Ŭ������ ȣ��Ǵ��� �˾ƺ������� ����
	}
	
	public int calcPrice(int price) // Customer.java Ŭ������ �ִ� calcPrice�� VIPCustomer.java Ŭ������ �Ȱ��� ���־�
									// �������ϰ������Ƿ� �� ��찡 "�������̵� �ߴ�"��� �� �� ����.
	{
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID()
	{
		return agentID;
	}
	

}
