/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.04.02
 * 
 */

package FightOfUnlimitedTower.system;

import javax.swing.JProgressBar;

import FightOfUnlimitedTower.gui.GameScreen;

public class LevelManager {
	
	private static int level = 1;
	public static int playerHP = 100;
	public static int monsterHP = 100;
	
	static JProgressBar getBar(String type) {
		return GameScreen.getBar(type);
	}
	
	private static void setString(String type) {
		getBar(type).setString(getBar(type).getValue() + "/" + getBar(type).getMaximum());
	}
	
	private static void setHP(String type, int hp) {
		getBar(type).setMaximum(hp);
	}
	
	static void setBarValue(String type, int value) {
		getBar(type).setValue(value);
		setString(type);
	}
	
	public static void start() {
		Player.init();
		Monster.init();
		
		setBarValue("playerHP", playerHP);
		setBarValue("monsterHP", monsterHP);
		
		Monster.attack();
	}
}
