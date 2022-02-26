/*
 * 11002 自主學習用 Java side project - 尋寶攻頂戰 Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.26
 * 
 */

package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.JFWindow;

public class GameScreen {
	public static final JPanel gui = new JPanel();
	JButton back = new JButton();
	GameScreen() {
		back.setText("back");
		back.setFocusable(false);
		back.addActionListener(e -> {
			gui.setVisible(false);
			JFWindow.gui.remove(gui);
			JFWindow.gui.add(MainMenu.gui);
			MainMenu.gui.setVisible(true);
		});
		
		gui.setBackground(new Color(150, 150, 150));
		
		gui.add(back);
	}
}
