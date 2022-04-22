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
	
	JLabel dimensionText = new JLabel();
	JLabel playerHPtext = new JLabel();
	JLabel monsterHPtext = new JLabel();
	static JProgressBar dimensionBar = new JProgressBar(0, 100);
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
		
		dimensionText.setText("距         離:");
		dimensionText.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 35f));
		dimensionBar.setString("COMING SOON");
		dimensionBar.setStringPainted(true);
		dimensionBar.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 30f));
		dimensionBar.setForeground(new Color(0, 255, 0));
		dimensionBar.setBackground(new Color(0, 100, 0));
		
		playerHPtext.setText("玩家血量:");
		playerHPtext.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 35f));
		playerHPbar.setPreferredSize(new Dimension(1000, 60));
		playerHPbar.setStringPainted(true);
		playerHPbar.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 30f));
		playerHPbar.setForeground(Color.red);
		playerHPbar.setBackground(Color.black);
		
		monsterHPtext.setText("怪物血量:");
		monsterHPtext.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 35f));
		monsterHPbar.setPreferredSize(new Dimension(1000, 60));
		monsterHPbar.setStringPainted(true);
		monsterHPbar.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 30f));
		monsterHPbar.setForeground(Color.red);
		monsterHPbar.setBackground(Color.black);
		
		
		monster.setPreferredSize(new Dimension(-1, MONSTER_HEIGHT));
		monster.setLayout(null);
		monster.setBackground(Color.green);
		
		level.setBounds(100, 50, 220, 50);
		monsterHPtext.setBounds((Init.SCREEN_WIDTH - 990) / 2, MONSTER_HEIGHT - 150, 160, 45);
		monsterHPbar.setBounds((Init.SCREEN_WIDTH - 1000) / 2, MONSTER_HEIGHT - 105, 1000, 60);
		monster.add(level);
		monster.add(monsterHPtext);
		monster.add(monsterHPbar);
		// - - -
		startGame.setText("Start");
		startGame.setBounds(100, 100, 100, 30);
		startGame.setFocusable(false);
		startGame.addActionListener(e -> {
			LevelManager.start();
			startGame.setEnabled(false);
		});
		monster.add(startGame);
		// - - -
		
		player.setPreferredSize(new Dimension(-1, PLAYER_HEIGHT));
		player.setLayout(null);
		player.setBackground(Color.yellow);
		dimensionText.setBounds((Init.SCREEN_WIDTH - 990) / 2, PLAYER_HEIGHT - 305, 160, 45);
		dimensionBar.setBounds((Init.SCREEN_WIDTH - 1000) / 2, PLAYER_HEIGHT - 260, 1000, 60);
		playerHPtext.setBounds((Init.SCREEN_WIDTH - 990) / 2, PLAYER_HEIGHT - 170, 160, 45);
		playerHPbar.setBounds((Init.SCREEN_WIDTH - 1000) / 2, PLAYER_HEIGHT - 125, 1000, 60);
		player.add(dimensionText);
		player.add(dimensionBar);
		player.add(playerHPtext);
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
		gui.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_H, 0), "treat");
		gui.getActionMap().put("treat", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Player.treat();
			}
		});
		
		//gui.setBackground(new Color(255, 200, 150));
		gui.setBackground(Color.red);
		gui.add(monster, BorderLayout.NORTH);
		gui.add(player, BorderLayout.SOUTH);
	}
}
