package chapter10_scheduler;

public class RoundRobin implements Scheduler
{

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCalToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}
	
}
