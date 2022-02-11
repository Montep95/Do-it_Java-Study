package cooperation;

public class takeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student bit = new Student("Bit", 10000);
		
		// 버스를 타는 제임스
		Bus bus100 = new Bus(100); // 100번 버스
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		// 지하철을 타는 빛
		Subway subwaygreen = new Subway(2); // 2호선
		bit.takeSubway(subwaygreen);
		bit.showInfo();
		subwaygreen.showInfo();
		
		
		
	}

}
