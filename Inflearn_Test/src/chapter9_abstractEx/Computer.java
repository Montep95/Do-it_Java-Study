package chapter9_abstractEx;

public abstract class Computer {
	
	public abstract void display(); // { } 없이 구현을 안하겠다는 말 = 메서드를 선언만 하겠다. (여기서 알 수 있는 것은, 매개변수, 반환값 정도알 수 있음)
	public abstract void typing(); // 위와 마찬가지로 구현은 안하고, 메서드만 선언함
	
	
	// 이런경우 구현코드가 없으므로 = 추상 메서드라고 한다.
	// 따라서 public과 void사이에 abstract를 넣어야한다.
	// 그렇게되면, class도 abstract를 요구하게 된다. (Computer)
	// 그렇다면 public과 class 사이 abstract를 넣어 추상클래스를 만들면 해결된다.
	// 언제 추상메서드를 사용하나 = 상위클래스에서는 구현이 필요한 메서드임에는 맞지만 어떻게 구현해야할지 모를때 (하위클래스)에서 구현되기 위해서
	// 추상메서드를 사용한다. -> 하위클래스에서는 추상메서드에 대한 구현의 책임이 있다고 한다. (상위클래스에서 하위클래스에 구현의 권한을 위임했다고말한다.)
	
	// public abstract int add(int x, int y); // 이 메서드는 두 개의 매개변수의 합을 반환하는 메서드이고, 추상클래스로는 이렇게 표현한다.
	
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}
