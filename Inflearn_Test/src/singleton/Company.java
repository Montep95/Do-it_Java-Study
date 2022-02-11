package singleton;

public class Company {
	
	private static Company instance = new Company(); // 이것이 유일하게 사용될 인스턴스이다.
									// null이나 함부로 바꾸게 되면 안되므로 private static을 붙여준다.
	
	private Company(){ } // 외부에서 이 생성자를 호출하지 못하게 하겠다.
						// singleton패턴 구현. 단 하나의 인스턴스만 존재하도록.
	
	public static Company getInstance() { // Company 는 리턴타입을 말함.
									// CompanyTest에서 사용되기위해서 public으로 생성해주어야함
									// static = 객체는 생성하지 않고 만들어주기 위해서 사용
		return instance;
		
	}
}
