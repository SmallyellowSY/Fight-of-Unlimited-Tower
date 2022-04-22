/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.04.03
 * 
 */

package FightOfUnlimitedTower.system;

public class Player {
	public static int HP;
	
	static void init() {
		HP = LevelManager.playerHP;
	}
	
	public static void attack() {
		if(Monster.HP > 0 && Player.HP > 0) Monster.hurt(1);
	}
	
	public static void hurt(int damage) {
		HP -= damage;
		LevelManager.setBarValue("playerHP", HP);
		if(HP <= 0) {
			die();
		}
	}
	//treat 治療
	public static void treat() {
		if(HP <= LevelManager.getBar("playerHP").getMaximum()) {
			HP += 10;
			LevelManager.setBarValue("playerHP", HP);
		}
	}
	
	private static void die() {
		LevelManager.getBar("playerHP").setString("Death");
	}	
}
