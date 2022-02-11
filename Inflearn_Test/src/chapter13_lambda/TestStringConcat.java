package chapter13_lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 1�� ���. ��ü���� ���α׷��� ����� ���� ������� ����
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("1�����", "Java Study");
		
		// 2�� ���. ���ٽ� ����
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("2�����", "Java Study");
		
		// 3�� ���. �͸�Ŭ������ ����� ���
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};	
		
		concat2.makeString("3�����", "Java Study");
	}

}
