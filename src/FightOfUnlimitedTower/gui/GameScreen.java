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
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.KeyStroke;

import FightOfUnlimitedTower.main.Init;
import FightOfUnlimitedTower.system.LevelManager;
import FightOfUnlimitedTower.system.Player;

public class GameScreen {
	public static final JPanel gui = new JPanel();
	// 1001/2 = 500...1
	// 1001/3 = 333...2
	private final int MONSTER_HEIGHT = Init.SCREEN_HEIGHT / 3 * 2 + 2;
	private final int PLAYER_HEIGHT = Init.SCREEN_HEIGHT / 3;
	JPanel monster = new JPanel();
	JPanel player = new JPanel();
	
	JLabel level = new JLabel();
	JLabel distance = new JLabel();
	
	JLabel monsterImage = new JLabel();
	
	JButton startGame = new JButton();

	static JProgressBar playerHPbar = new JProgressBar(0, LevelManager.playerHP);
	static JProgressBar monsterHPbar = new JProgressBar(0, LevelManager.monsterHP);
	
	public static JProgressBar getBar(String type) {
		switch(type) {
		case "playerHP":
			return playerHPbar;
		case "monsterHP":
			return monsterHPbar;
		default: return null;
		}
	}
	
	GameScreen() {
		
		level.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 50f));
		level.setText("LEVEL: 1");
		level.setBackground(Color.orange);
		//level.setOpaque(true);
		
		//playerHPbar.setPreferredSize(new Dimension(1000, 60));
		playerHPbar.setStringPainted(true);
		playerHPbar.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 30f));
		playerHPbar.setForeground(Color.red);
		playerHPbar.setBackground(Color.black);
		
		//monsterHPbar.setPreferredSize(new Dimension(1000, 60));
		monsterHPbar.setStringPainted(true);
		monsterHPbar.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 30f));
		monsterHPbar.setForeground(Color.red);
		monsterHPbar.setBackground(Color.black);
		
		monster.setPreferredSize(new Dimension(-1, MONSTER_HEIGHT));
		monster.setLayout(null);
		monster.setBackground(Color.green);
		
		level.setBounds(100, 50, 220, 50);
		monsterHPbar.setBounds((Init.SCREEN_WIDTH - 1000) / 2, MONSTER_HEIGHT - 100, 1000, 60);
		monster.add(level);
		monster.add(monsterHPbar);
		
		startGame.setText("Start");
		startGame.setBounds(100, 100, 100, 30);
		startGame.setFocusable(false);
		startGame.addActionListener(e -> {
			LevelManager.start();
			startGame.setEnabled(false);
		});
		monster.add(startGame);
		
		player.setPreferredSize(new Dimension(-1, PLAYER_HEIGHT));
		player.setLayout(null);
		player.setBackground(Color.yellow);
		
		playerHPbar.setBounds((Init.SCREEN_WIDTH - 1000) / 2, PLAYER_HEIGHT - 120, 1000, 60);
		player.add(playerHPbar);
		
		gui.setLayout(new BorderLayout());
		
		//LevelManager.start();
		
		//ESC 27
		gui.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "S");
		gui.getActionMap().put("S", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiInit.changeGui("escOptions");
			}
		});
		gui.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_K, 0), "attack");
		gui.getActionMap().put("attack", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Player.attack();
			}
		});
		
		//gui.setBackground(new Color(255, 200, 150));
		gui.setBackground(Color.red);
		gui.add(monster, BorderLayout.NORTH);
		gui.add(player, BorderLayout.SOUTH);
	}
}
