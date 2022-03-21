/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.03.13
 */

package FightOfUnlimitedTower.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import FightOfUnlimitedTower.main.Init;

public class EscOptions {
	public static JPanel gui = new JPanel();
	//JPanel lnorth = new JPanel();
	JPanel center = new JPanel();
	JLabel layout = new JLabel();
	JLabel title = new JLabel();
	private final int LONG_BUTTON_WIDTH = 600;
	private final int SHORT_BUTTON_WIDTH = (LONG_BUTTON_WIDTH - 20)/2;
	private final int BUTTON_HEIGHT = 65;
	JButton back = new JButton();
	JButton options = new JButton();
	JButton none = new JButton();
	JButton leave = new JButton();
	
	private void backAction() {
		GuiInit.changeGui("gameScreen");
	}
	EscOptions() {
		title.setText("遊戲暫停");
		title.setForeground(new Color(255, 255, 255));
		title.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 30f));
		
		back.setText("返回遊戲");
		back.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 35f));
		back.setPreferredSize(new Dimension(LONG_BUTTON_WIDTH, BUTTON_HEIGHT));
		back.setFocusable(false);
		back.addActionListener(e -> backAction());
		
		options.setText("選項...");
		options.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 35f));
		options.setPreferredSize(new Dimension(SHORT_BUTTON_WIDTH, BUTTON_HEIGHT));
		options.setFocusable(false);
		options.setEnabled(false);
		
		none.setText("");
		none.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 35f));
		none.setPreferredSize(new Dimension(SHORT_BUTTON_WIDTH, BUTTON_HEIGHT));
		none.setFocusable(false);
		none.setEnabled(false);
		
		
		leave.setText("離開遊戲");
		leave.setFont(Init.getFont(Init.font_taipei, Font.PLAIN, 35f));
		leave.setPreferredSize(new Dimension(LONG_BUTTON_WIDTH, BUTTON_HEIGHT));
		leave.setFocusable(false);
		leave.setEnabled(false);
		
		layout.setPreferredSize(new Dimension(700, 50));
		center.setBackground(new Color(0, 0, 200, 0));
		center.setPreferredSize(new Dimension(700, 1080));
		center.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		center.add(layout);
		
		center.add(title);
		center.add(back);
		center.add(options);
		center.add(none);
		center.add(leave);
		
		gui.setBackground(new Color(0, 0, 0, 200));
		gui.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "esc");
		gui.getActionMap().put("esc", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("-ESC Event ");
				backAction();
			}
		});
		gui.add(center);
	}
}
