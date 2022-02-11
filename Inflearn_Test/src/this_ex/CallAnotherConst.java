package this_ex;

class Person
{
	String name;
	int age;
	
	public Person()
	{
		// name = "test"; = 이경우 생성되지않은 메모리에 값을 넣은것이므로 오류
		
		this("이름없음", 1); // 따라서 이 코드가 가장 먼저 나와야함 (이 생성자 안에서)
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf()
	{
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person(); // 이것을 호출했을때 기본 값을 "이름없음", 1 이라고 지정해주고싶음
									// 그렇다면 위의 Person()를 호출하게됨 
		System.out.println(p1.name); // p1의 이름을 출력해보면 이름없음이 출력됨
		
		Person p2 = new Person("홍길동", 28);
		System.out.println(p2.name + " " + p2.age); // 내가 한 예제
		
		System.out.println(p1.returnSelf()); // this 값이 출력됨을 확인할 수 있음
		

	}

}
