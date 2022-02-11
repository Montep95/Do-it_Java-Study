package chapter13_lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 1번 방법. 객체지향 프로그래밍 방식의 기존 방식으로 구현
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("1번방법", "Java Study");
		
		// 2번 방법. 람다식 구현
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("2번방법", "Java Study");
		
		// 3번 방법. 익명클래스를 사용한 방법
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};	
		
		concat2.makeString("3번방법", "Java Study");
	}

}
