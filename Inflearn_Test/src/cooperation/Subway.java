package cooperation;

public class Subway {
	int lineNumber; // 노선번호
	int passengerCount; // 승객 수
	int money; // 돈
	
	public Subway(int lineNumber) //모든 지하철은 노선을 가져야한다. (기본생성자 설정)
	{
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) // 승객을 태움
	{
		passengerCount++;
		this.money += money; //위의 매개변수를 받았으므로, 받은만큼 돈이 증가해야해서 += money로 설정한다.
	}
	
	public void showInfo()
	{
		System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고, 지하철 수입은 "
				+ money + "원 입니다.");
	}

}
