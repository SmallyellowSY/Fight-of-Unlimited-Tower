/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.14
 * 
 */

package FightOfUnlimitedTower.main;

import javax.swing.JFrame;

import FightOfUnlimitedTower.gui.GuiInit;
import FightOfUnlimitedTower.gui.Loading;

public class JFWindow {
	public static final JFrame gui = new JFrame();
	
    public JFWindow() {
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//gui.setResizable(false);
		//gui.setSize(Init.SCREEN_WIDTH/2, Init.SCREEN_HEIGHT/2);
		gui.setSize(1920/2, 1080/2);
		//視窗最大化
		gui.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//gui.setLocation(Init.SCREEN_WIDTH/4, Init.SCREEN_HEIGHT/4);
		gui.setTitle("Fight of Unlimited Tower " + Init.VERSION);
		
		gui.add(GuiInit.guiCard);
		
		gui.setVisible(true);
		
		Loading.load();	
	}
}
