package chapter9_template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	// 이처럼 차가 가거나, 멈추는 방법은 차의 종류에 따라 다를 수 있으므로 추상메서드로 선언하고
	// 나중에 하위 클래스에서 구현할 수 있도록함. = ManualCar와 AICar에서 drive(), stop() 출력이 다름.
	
	public abstract void wiper();
	
	public void washCar() {}; // 실제로 구현은 한거지만 구현코드가 없는 것. = 추상메서드가 아님.
	
	public void startCar()
	{
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff()
	{
		System.out.println("시동을 끕니다.");
	}
	
	public final void run() // 달리는 것의 메커니즘, 시동걸고, 운전하고, 멈추고, 시동끄고
							// 고정된 시나리오 지정 (final) = 하위클래스에서는 이 run()메서드를 재정의 할 수 없다.
							// 이를 템플릿 메서드라고 한다!
							// 참고로 final public void = public final void 순서는 상관없다.
	{
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // 추가를 하더라도 하위클래스에 영향이 가지 않는다. (구현이 되어있기때문에 = 추상메서드가 아니기때문에) 
					// >> 필요에 의해 재정의가 가능함. (강제적이지 않음)
		turnOff();
	}

}
