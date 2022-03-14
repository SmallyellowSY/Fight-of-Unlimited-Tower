/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.24
 * 
 */

package FightOfUnlimitedTower.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import FightOfUnlimitedTower.main.Init;

public class Options {
	private final String TITLE_STRING = "<html><p style=\""
			+ "font-size: 50px;"
			+ "color: rgb(255, 255, 0);"
			+ "\">"
			+ "Options"
			+ "</p></html>";
	
	private final String BACK_STRING = "<html><p style=\""
			+ "font-size: 20px;"
			//+ "color: rgb(255, 255, 0);"
			+ "\">"
			+ "Back"
			+ "</p></html>";
	
	public static final JPanel gui = new JPanel();
	JLabel title = new JLabel();
	JButton back = new JButton();
	
	JPanel north = new JPanel();
	JPanel south = new JPanel();
	Options() {
		//gui.setVisible(true);
		title.setText(TITLE_STRING);
		
		back.setText(BACK_STRING);
		back.setForeground(new Color(255, 255, 0));
		back.setBackground(new Color(0, 0, 200));
		back.setFocusable(false);
		back.setBorderPainted(false);
		//back.setContentAreaFilled(false);
		back.setPreferredSize(new Dimension(150, 50));
		back.addMouseListener(new MouseListener() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back.setForeground(new Color(255, 150, 0));
				back.setBackground(new Color(0, 0, 200));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				back.setForeground(new Color(255, 255, 0));
				back.setBackground(new Color(0, 0, 200));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				UIManager.put("Button.select", new Color(0, 130, 200));
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				UIManager.put("Button.select", Init.DEFAULT_BUTTON_SELECT_COLOR);
				back.setForeground(new Color(255, 255, 0));
				//back.setBackground(new Color(0, 0, 200));
			}
		});
		back.addActionListener(e -> {
			GuiInit.changeGui("mainMenu");
		});
		
		
		north.setBackground(new Color(0, 0, 50));
		north.setPreferredSize(new Dimension(-1, 100));
		north.add(title);
		
		south.setBackground(new Color(0, 0, 100));
		south.setPreferredSize(new Dimension(-1, 100));
		south.setLayout(new FlowLayout(FlowLayout.TRAILING, 50, 25));
		south.add(back);
		
		gui.setBackground(new Color(0, 0, 50));
		gui.setLayout(new BorderLayout());
		gui.add(north, BorderLayout.NORTH);
		gui.add(south, BorderLayout.SOUTH);
		
	}
}
