package chapter10_scheduler;

public class LeastJob implements Scheduler
{

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCalToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 가장 적은 상담원에게 할당합니다.");
	}
	
}
