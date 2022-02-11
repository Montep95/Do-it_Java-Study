package chapter8_witharraylist;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	// ��Ӱ��迡���� ��밡���ϵ��� �ϴ� ���������� = protected

	protected int bonusPoint;
	protected double bonusRatio; // ������ ó���ؾ��ϹǷ� double��, ���������ڰ� default���̹Ƿ� ���� Ŭ���� �������� Ȯ�� ����.
						// protected�� �������־� VIPCustomerŬ���������� ����� �� �ְ� �ؾ���.
	
	// �Ϲݰ������� �ʿ���� �Ӽ�, VIP�� �Ӽ��̹Ƿ� ������� ó�����־���Ѵ�.
	// private int saleRatio;
	// private int agentID;
	///////////////////////////
	
	public Customer() // �� �κ��� �ּ�ó���ϰ� �Ǹ� ���� �޼ҵ��� public Customer(int customerID...) ó��
	{
		// super(); // �� ��� ����� �޴� Ŭ������ ��� Ŭ�������� ����� ���ִ� "Object"Ŭ������.
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() ȣ��");
	}
	
	public Customer(int customerID, String customerName) // ���� Customer()�� �����Ǹ� 
														// �⺻������ ������ ID�� �̸��� �޾ƾ��Ѵٴ� ���� ����.
	{
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) // ���� �޼ҵ忡���� SILVER, VIP, GOLDó�� ���� �þ ���� ��ҵ��� �ʹ� ����.
									// �̷� ��� ����� ����ϴµ� ������ �ڵ�� �ټ� �߸�Ȱ��ǰ� �ִ� ���̴�.
	{
		bonusPoint += price * bonusRatio;
		return price;
		
		/*
		if(customerGrade == "SILVER")
		{
			bonusPoint += price * bonusRatio;
		}
		else if (customerGrade == "VIP")
		{
			
		}
		else if (customerGrade == "GOLD")
		{
			
		}
		*/
	}
	
	public String showCustomerInfo()
	{
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	

}
