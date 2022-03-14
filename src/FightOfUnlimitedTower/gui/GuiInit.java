/*
 * 11002 Self-directed Learning: Java side project - Fight of Unlimited Tower
 * coded by Small_yellow
 * 2022.02.26
 */

package FightOfUnlimitedTower.gui;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class GuiInit {
	public static final JPanel guiCard = new JPanel();
	private static final CardLayout card = new CardLayout();
	public static void init() {
		createGui();
		guiCard.setLayout(card);
		
		guiCard.add(MainMenu.gui, "mainMenu");
		guiCard.add(GameScreen.gui, "gameScreen");
		guiCard.add(Options.gui, "options");
		guiCard.add(EscOptions.gui, "escOptions");
		
		card.show(guiCard, "mainMenu");
	}
	
	private static void createGui() {
		new MainMenu();
		new GameScreen();
		new Options();
		new EscOptions();
	}
	
	public static void changeGui(String gui) {
		card.show(guiCard, gui);
	}
}
