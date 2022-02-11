package chapter8_witharraylist;

public class GoldCustomer extends Customer
{
	double saleRatio; // 이처럼 그냥 따로 만들어준다.
	
	public GoldCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		// saleRatio는 VIPCustomer에 존재하지만 이중 상속이 되게되면 복잡해진다.
		
	}

	@Override
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;	
		return price - (int)(price * saleRatio);
	}
	
	
}
