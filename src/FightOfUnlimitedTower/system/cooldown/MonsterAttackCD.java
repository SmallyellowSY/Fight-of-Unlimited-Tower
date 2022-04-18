/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.04.18
 * 
 */

package FightOfUnlimitedTower.system.cooldown;

import FightOfUnlimitedTower.system.Monster;
import FightOfUnlimitedTower.system.Player;

public class MonsterAttackCD extends Thread {
	private int cooldown, damage;
	
	public MonsterAttackCD(String monsterIn) {
		cooldown = 500;
		damage = 3;
	}
	
	@Override
	public void run() {
		try {
			while(Player.HP > 0 && Monster.HP > 0) {
				Thread.sleep(cooldown);
				Player.hurt(damage);
			}
		} catch (InterruptedException e) {
			e.printStackTrace(); //輸出錯誤訊息[比 println(e) 更多資訊]
		}
	}
}
