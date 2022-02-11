package singleton;

public class Company {
	
	private static Company instance = new Company(); // �̰��� �����ϰ� ���� �ν��Ͻ��̴�.
									// null�̳� �Ժη� �ٲٰ� �Ǹ� �ȵǹǷ� private static�� �ٿ��ش�.
	
	private Company(){ } // �ܺο��� �� �����ڸ� ȣ������ ���ϰ� �ϰڴ�.
						// singleton���� ����. �� �ϳ��� �ν��Ͻ��� �����ϵ���.
	
	public static Company getInstance() { // Company �� ����Ÿ���� ����.
									// CompanyTest���� ���Ǳ����ؼ� public���� �������־����
									// static = ��ü�� �������� �ʰ� ������ֱ� ���ؼ� ���
		return instance;
		
	}
}
