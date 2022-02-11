package chapter9_template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	// ��ó�� ���� ���ų�, ���ߴ� ����� ���� ������ ���� �ٸ� �� �����Ƿ� �߻�޼���� �����ϰ�
	// ���߿� ���� Ŭ�������� ������ �� �ֵ�����. = ManualCar�� AICar���� drive(), stop() ����� �ٸ�.
	
	public abstract void wiper();
	
	public void washCar() {}; // ������ ������ �Ѱ����� �����ڵ尡 ���� ��. = �߻�޼��尡 �ƴ�.
	
	public void startCar()
	{
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	public void turnOff()
	{
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public final void run() // �޸��� ���� ��Ŀ����, �õ��ɰ�, �����ϰ�, ���߰�, �õ�����
							// ������ �ó����� ���� (final) = ����Ŭ���������� �� run()�޼��带 ������ �� �� ����.
							// �̸� ���ø� �޼����� �Ѵ�!
							// ����� final public void = public final void ������ �������.
	{
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // �߰��� �ϴ��� ����Ŭ������ ������ ���� �ʴ´�. (������ �Ǿ��ֱ⶧���� = �߻�޼��尡 �ƴϱ⶧����) 
					// >> �ʿ信 ���� �����ǰ� ������. (���������� ����)
		turnOff();
	}

}
