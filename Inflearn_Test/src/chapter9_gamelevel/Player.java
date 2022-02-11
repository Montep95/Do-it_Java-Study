package chapter9_gamelevel;

public class Player {
	
	private PlayerLevel level;
	public Player() { // �⺻������, level������ �ʱ�ȭ�ϱ� ���� ����
		level = new BeginnerLevel();
		level.showLevelMessage(); // ������ �ٲ𶧸��� ǥ���� ����.
	}

	public PlayerLevel getLevel() {
		return level;
	}
 
	public void upgradeLevel(PlayerLevel level) { // advancedLevel�� ���ü����ְ�, SuperLevel�� ���� ���� �����Ƿ�
													// PlayerLevel�� ������ ��
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
	
	
	
	
}
