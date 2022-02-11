package chapter8_witharraylist;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	// 상속관계에서는 사용가능하도록 하는 접근지정자 = protected

	protected int bonusPoint;
	protected double bonusRatio; // 비율을 처리해야하므로 double형, 접근지정자가 default형이므로 같은 클래스 내에서만 확인 가능.
						// protected로 지정해주어 VIPCustomer클래스에서도 사용할 수 있게 해야함.
	
	// 일반고객에서는 필요없는 속성, VIP의 속성이므로 상속으로 처리해주어야한다.
	// private int saleRatio;
	// private int agentID;
	///////////////////////////
	
	public Customer() // 이 부분을 주석처리하게 되면 밑의 메소드인 public Customer(int customerID...) 처럼
	{
		// super(); // 이 경우 상속을 받는 클래스는 모든 클래스에게 상속을 해주는 "Object"클래스임.
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 호출");
	}
	
	public Customer(int customerID, String customerName) // 위의 Customer()가 생략되면 
														// 기본값으로 무조건 ID와 이름을 받아야한다는 것을 선언.
	{
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) // 여기 메소드에서는 SILVER, VIP, GOLD처럼 점점 늘어갈 가변 요소들이 너무 많다.
									// 이럴 경우 상속을 써야하는데 지금의 코드는 다소 잘못활용되고 있는 것이다.
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
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
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
