/*
 * 11002 自主學習用 Java side project - 尋寶攻頂戰 Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.24
 * 
 */

package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.JFWindow;

public class Options {
	static final JPanel gui = new JPanel();
	JLabel title = new JLabel();
	JButton back = new JButton();
	Options() {
		//gui.setVisible(true);
		title.setText("Options");
		back.setText("back");
		back.setFocusable(false);
		back.addActionListener(e -> {
			gui.setVisible(false);
			JFWindow.gui.remove(gui);
			JFWindow.gui.add(MainMenu.gui);
			MainMenu.gui.setVisible(true);
		});
		
		gui.setBackground(new Color(0, 150, 150));
		
		gui.add(title);
		gui.add(back);
		
	}
}
