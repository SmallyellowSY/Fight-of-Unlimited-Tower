/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.26
 * 
 */

package FightOfUnlimitedTower.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.KeyStroke;

public class GameScreen {
	public static final JPanel gui = new JPanel();
	JButton back = new JButton();
	JLabel monster = new JLabel();
	JProgressBar playerHP = new JProgressBar();
	
	GameScreen() {
		back.setText("back");
		back.setFocusable(false);
		back.addActionListener(e -> {
			GuiInit.changeGui("mainMenu");
		});
		
		//ESC 27
		gui.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "S");
		gui.getActionMap().put("S", new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ESC Event ");
				GuiInit.changeGui("escOptions");
			}
		});
		
		gui.setBackground(new Color(255, 200, 150));
		
		gui.add(back);
	}
}
