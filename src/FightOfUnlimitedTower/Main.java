/*
 * 11002 �ۥD�ǲߥ� Java side project - �M�_�𳻾� Fight of Unlimited Tower
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
