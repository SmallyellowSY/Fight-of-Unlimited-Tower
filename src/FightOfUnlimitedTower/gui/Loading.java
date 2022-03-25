/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded bt Small_yellow
 * 2022.03.25
 * 
 */

package FightOfUnlimitedTower.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import FightOfUnlimitedTower.main.Init;

public class Loading {
	public static JPanel gui = new JPanel();
	
	JLabel layout = new JLabel();
	JLabel title = new JLabel();
	private static final int MAX = 100;
	static JProgressBar loadBar = new JProgressBar(0, MAX);
	private static int loadProgress = 0;
	
	Loading() {
		title.setText("    LOADING...");
		title.setPreferredSize(new Dimension(650, 100));
		title.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 100f));
		title.setBackground(Color.green);
		//title.setOpaque(true);
		
		loadBar.setStringPainted(true);
		loadBar.setPreferredSize(new Dimension(1500, 50));
		loadBar.setFont(Init.getFont(Init.font_taipei, Font.ITALIC, 30f));
		loadBar.setForeground(new Color(250, 190, 0));
		loadBar.setBackground(new Color(0, 0, 100));
		
		layout.setPreferredSize(new Dimension(1500, 300));
		layout.setBackground(Color.black);
		//layout.setOpaque(true);
		
		gui.setBackground(new Color(0, 200, 250, 255));
		gui.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 30));
		gui.add(layout);
		gui.add(title);
		gui.add(loadBar);
		
	}
	
	public static void load() {
		while(loadProgress <= MAX) {
			loadBar.setValue(loadProgress);
			loadProgress +=1;
			
			try {Thread.sleep(50);}
			catch (InterruptedException e) {e.printStackTrace();}
		}

		int[] dimension = {gui.getSize().width, gui.getSize().height};
		Init.setScreenSize(dimension);
		GuiInit.load(1);
	}
}
