package chapter10_scheduler;

public class PriorityAllocation implements Scheduler
{

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCalToAgent() {
		System.out.println("���� ��ų�� ������� ������ ��⿭�� �켱 ����մϴ�.");
	}
	
}
