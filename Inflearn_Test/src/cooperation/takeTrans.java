package cooperation;

public class takeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student bit = new Student("Bit", 10000);
		
		// ������ Ÿ�� ���ӽ�
		Bus bus100 = new Bus(100); // 100�� ����
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		// ����ö�� Ÿ�� ��
		Subway subwaygreen = new Subway(2); // 2ȣ��
		bit.takeSubway(subwaygreen);
		bit.showInfo();
		subwaygreen.showInfo();
		
		
		
	}

}
