/*
 * 11002 自主學習用 Java side project - 尋寶攻頂戰 Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.14
 * 
 */

package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Init;
import main.JFWindow;

public class MainMenu {
	public static final JPanel gui = new JPanel();
	
	private final String PLAY_STRING = "<html><p style=\""
			+ "font-size: 25px;"
			+ "\">"
			+ "Play"
			+ "</p></html>";
	
	private final String OPTIONS_STRING = "<html><p style=\""
			+ "font-size: 25px;"
			+ "\">"
			+ "Options"
			+ "</p></html>";
	
	private final String EXIT_STRING = "<html><p style=\""
			+ "font-size: 25px;"
			+ "\">"
			+ "Exit"
			+ "</p></html>";
	
	private final String VERSION_STRING = "<html><p style=\""
			+ "font-size: 20px;"
			+ "\">Version: "
		    + Init.VERSION
		    + "</p></html>";
	
	final String AUTHOR_STRING = "<html><p style=\""
			+ "font-size: 20px;"
			+ "\">Made by Small_yellow&nbsp</p></html>";
	
	private final int BUTTON_WIDTH = 300;
	private final int BUTTON_HEIGHT = 70; 
	private final String LOGO_PATH = "C:/Users/user/Desktop/FightOfUnlimitedTower_logo.png";
	
	JLabel logo = new JLabel();
	ImageIcon logo_image = new ImageIcon(LOGO_PATH);
	JButton play = new JButton();
	JButton options = new JButton();
	JButton exit = new JButton();
	
	JLabel version = new JLabel();
	JLabel author = new JLabel();
	
	JPanel lgwest = new JPanel();
	JPanel menu = new JPanel();
	JPanel info = new JPanel();
	MainMenu() {
		logo.setIcon(logo_image);
		
		play.setText(PLAY_STRING);
		play.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		play.setFocusable(false);
		play.addActionListener(e -> {
			gui.setVisible(false);
			JFWindow.gui.remove(gui);
			JFWindow.gui.add(GameScreen.gui);
			GameScreen.gui.setVisible(true);
		});
		options.setText(OPTIONS_STRING);
		options.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		options.setFocusable(false);
		options.addActionListener(e -> {
			gui.setVisible(false);
			JFWindow.gui.remove(gui);
			JFWindow.gui.add(Options.gui);
			Options.gui.setVisible(true);
		});
		exit.setText(EXIT_STRING);
		exit.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		exit.setFocusable(false);
		exit.addActionListener(e -> {
			JFWindow.gui.dispose();
			System.exit(0);
		});
		
		version.setText(VERSION_STRING);
		author.setText(AUTHOR_STRING);
		
		
		menu.setBackground(new Color(0, 130, 250));
		menu.setPreferredSize(new Dimension(500, -1));
		
		menu.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 30));
		menu.add(logo);
		menu.add(play);
		menu.add(options);
		menu.add(exit);
		
		lgwest.setPreferredSize(new Dimension(650, -1));
		lgwest.setLayout(new BorderLayout());
		lgwest.add(menu, BorderLayout.EAST);
		
		info.setBackground(Color.gray);
		info.setPreferredSize(new Dimension(-1, 50));
		info.setLayout(new BorderLayout());
		info.add(version, BorderLayout.WEST);
		info.add(author, BorderLayout.EAST);
		
		gui.setLayout(new BorderLayout());
		gui.add(lgwest, BorderLayout.WEST);
		gui.add(info, BorderLayout.SOUTH);
		
	}
}
