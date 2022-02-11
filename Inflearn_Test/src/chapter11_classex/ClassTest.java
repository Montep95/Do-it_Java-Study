package chapter11_classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person(); // 인스턴스 person생성
		
		Class pClass1 = person.getClass(); // getClass()메서드는 Object의 메서드이고 그 메서드를 상속받았기 때문에 사용이 가능
										// 클래스의 클래스를 반환해주는 메서드
		System.out.println(pClass1.getName()); // 패키지이름.Person이 출력됨
		
		Class pClass2 = Person.class; // getClass()메서드처럼 이러한 방식"으로도" 가져올 수 있다.
		System.out.println(pClass2.getName()); // 위와 똑같이 패키지이름.Person이 출력됨
		
		Class pClass3 = Class.forName("chapter11_classex.Person"); // forName은 클래스의 이름을 치면 그 클래스를 가져올 수 있음!, Add throws 예외처리를 해주어야함
		System.out.println(pClass3.getName()); // 위와 똑같이 패키지이름.Person이 출력됨
		
		// pClass1, 2, 3 방법이 모두 쓰일 수 있음을 알아야함.
		
		
		Class pClass4 = Class.forName("java.lang.String");
		System.out.println(pClass4.getName());
		
		Person p = new Person();
		Class pClass5 = Class.forName("chapter11_classex.Person");
		
		//Person p2 = (Person)pClass5.newInstance();
		System.out.println(p);
		//System.out.println(p2);
		
		
	}

}
