package ch17;

public class PlayBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		Super sLevel = new Super();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
