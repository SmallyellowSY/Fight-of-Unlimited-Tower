/*
 * 11002 �ۥD�ǲߥ� Java side project - �M�_�𳻾� Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.14
 * 
 */

package main;

import javax.swing.JFrame;

import gui.GuiInit;
import gui.MainMenu;

public class JFWindow {
	public static final JFrame gui = new JFrame();
	
    JFWindow() {
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//gui.setResizable(false);
		gui.setSize(Init.SCREEN_WIDTH/2, Init.SCREEN_HEIGHT/2);
		//�����̤j��
		gui.setExtendedState(JFrame.MAXIMIZED_BOTH);
		gui.setLocation(Init.SCREEN_WIDTH/4, Init.SCREEN_HEIGHT/4);
		gui.setTitle("Fight of Unlimited Tower " + Init.VERSION);
		
		GuiInit.init();
		gui.add(MainMenu.gui);

		gui.setVisible(true);
	}
}
