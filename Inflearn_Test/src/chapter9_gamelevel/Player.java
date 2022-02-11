package chapter9_gamelevel;

public class Player {
	
	private PlayerLevel level;
	public Player() { // 기본생성자, level변수를 초기화하기 위해 만듦
		level = new BeginnerLevel();
		level.showLevelMessage(); // 레벨이 바뀔때마다 표현할 것임.
	}

	public PlayerLevel getLevel() {
		return level;
	}
 
	public void upgradeLevel(PlayerLevel level) { // advancedLevel이 들어올수도있고, SuperLevel이 들어올 수도 있으므로
													// PlayerLevel로 지정한 것
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
	
	
	
	
}
