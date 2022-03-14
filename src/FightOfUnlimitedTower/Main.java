/*
 * 11002 自主學習用 Java side project - 尋寶攻頂戰 Fight of Unlimited Tower
 *   11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.14
 * 
 */

package FightOfUnlimitedTower;

import FightOfUnlimitedTower.gui.GuiInit;
import FightOfUnlimitedTower.main.Init;
import FightOfUnlimitedTower.main.JFWindow;

public class Main {
	public static void main(String[] args) {
		Init.inits();
		GuiInit.init();
		new JFWindow();
	}
}
