package chapter8_inheritance;

public class VIPCustomer extends Customer // 상속을 받겠다 선언. 
{
	
	/* 이부분또한 상속받았으므로 필요없는 부분.
	protected int customerID;
	protected String customerName;
	protected String customerGrade;

	int bonusPoint;
	double bonusRatio; // 비율을 처리해야하므로 double형
	*/
	
	// 일반고객에서는 필요없는 속성, VIP의 속성이므로 상속으로 처리해주어야한다.
	double saleRatio;
	private int agentID;
	///////////////////////////
	
	public VIPCustomer()
	{
		// super(); // 자기의 바로 위 상위클래스를 호출 = Customer()가 호출됨.
		// super(int customerID, String customerName) // 자기의 바로 위 상위클래스를 호출 = Customer(int customerID, String customerName)이 호출됨.
		
		customerGrade = "VIP"; // Customer 클래스에서 private으로 선언하면 오류 발생.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		// System.out.println("VIPCustomer() 호출"); // 상위클래스호출 시 하위클래스가 호출되는지 알아보기위한 구문
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);
		customerGrade = "VIP"; // Customer 클래스에서 private으로 선언하면 오류 발생.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		// System.out.println("VIPCustomer() 호출"); // 상위클래스호출 시 하위클래스가 호출되는지 알아보기위한 구문
	}
	
	public int calcPrice(int price) // Customer.java 클래스에 있는 calcPrice를 VIPCustomer.java 클래스에 똑같이 써주어
									// 재정의하고있으므로 이 경우가 "오버라이딩 했다"라고 볼 수 있음.
	{
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID()
	{
		return agentID;
	}
	

}
