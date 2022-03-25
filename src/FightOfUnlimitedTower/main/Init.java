/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.26
 * 
 */

package FightOfUnlimitedTower.main;

import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;

public class Init {
	//public static final int SCREEN_WIDTH = 1920;
	//public static final int SCREEN_HEIGHT = 1080 - 23 - 40;
	
	public static final String VERSION = "20220325";
	
	public static final Color DEFAULT_BUTTON_SELECT_COLOR = new Color(184, 207, 229);
	
	public static final String LOGO_PATH = "src/resources/images/FightOfUnlimitedTower_logo.png";
	
	public static final String FONT_PATH = "src/resources/fonts/TaipeiSansTCBeta-Bold.ttf";
	
	public static Font font_taipei;
	
	
	public static void inits() {
		try {
			font_taipei = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(FONT_PATH));
		} catch(Exception e) {System.out.println(e);}
	}
	
	public static int SCREEN_WIDTH, SCREEN_HEIGHT;
	public  static void setScreenSize(int[] dimension) {
		SCREEN_WIDTH = dimension[0];
		SCREEN_HEIGHT = dimension[1];
		//System.out.println(SCREEN_WIDTH + " - " + SCREEN_HEIGHT);
	}
	
	public static Font getFont(Font fontIn, int style, float size) {
		return fontIn.deriveFont(style, size);
	}
}
