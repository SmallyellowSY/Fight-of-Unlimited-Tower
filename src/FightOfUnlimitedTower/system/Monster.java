/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.04.03
 * 
 */

package FightOfUnlimitedTower.system;

import FightOfUnlimitedTower.system.cooldown.MonsterAttackCD;

public class Monster {
	public static int HP;
	
	static void init() {
		HP = LevelManager.monsterHP;
	}
	
	public static void attack() {
		new MonsterAttackCD("Undefined").start();
	}
	
	public static void hurt(int damage) {
		HP -= damage;
		LevelManager.setBarValue("monsterHP", HP);
		if(HP <= 0) {
			die();
		}
	}
	
	private static void die() {
		LevelManager.getBar("monsterHP").setString("Death");
	}	
}
