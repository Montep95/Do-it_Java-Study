package chapter10_scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		// R, L, P
		System.out.println("전화 상담 배분방식을 선택하세요 : R, L, P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r')
		{
			scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l')
		{
			scheduler = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p')
		{
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		// 똑같은 메서드를 불렀지만 어떤 값에 따라 다른 기능이 구현되는 "다형성"을 보여줌.
		scheduler.getNextCall();
		scheduler.sendCalToAgent();
	}

}
