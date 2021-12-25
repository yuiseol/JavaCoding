package ch16_interface;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player();
		
		BeginnerLevel fLevel = new BeginnerLevel();
		player.upgradeLevel(fLevel);
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}

}

