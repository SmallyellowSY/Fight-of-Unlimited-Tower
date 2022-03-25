/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.26
 * 
 */

package FightOfUnlimitedTower.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.KeyStroke;

import FightOfUnlimitedTower.main.Init;

public class GameScreen {
	public static final JPanel gui = new JPanel();
	JPanel monster = new JPanel();
	JPanel player = new JPanel();
	
	JLabel monsterImage = new JLabel();
	
	private int playerHP = 100;
	private int monsterHP = 100;
	JProgressBar playerHPbar = new JProgressBar(0, playerHP);
	JProgressBar monsterHPbar = new JProgressBar(0, monsterHP);
	
	GameScreen() {
		playerHPbar.setPreferredSize(new Dimension(1000, 60));
		playerHPbar.setStringPainted(true);
		playerHPbar.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 30f));
		//playerHPbar.setForeground(Color.red);
		playerHPbar.setBackground(Color.black);
		
		playerHPbar.setValue(75);
		
		playerHPbar.setString(playerHPbar.getValue() + "/" + playerHP);
		
		monster.setPreferredSize(new Dimension(-1, Init.SCREEN_HEIGHT/2));
		monster.setBackground(Color.green);
		
		
		player.setPreferredSize(new Dimension(-1, Init.SCREEN_HEIGHT/2 + 1));
		player.setBackground(Color.yellow);
		
		player.add(playerHPbar);
		
		gui.setLayout(new BorderLayout());
		
		//ESC 27
		gui.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "S");
		gui.getActionMap().put("S", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiInit.changeGui("escOptions");
			}
		});
		
		//gui.setBackground(new Color(255, 200, 150));
		gui.setBackground(Color.red);
		gui.add(monster, BorderLayout.NORTH);
		gui.add(player, BorderLayout.SOUTH);
	}
}
