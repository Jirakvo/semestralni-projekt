package cz.uhk.fim.pro2.gui;

import javax.swing.JButton;

public class GameScreen extends Screen {
	
	public GameScreen(MainFrame mainFrame){
		super(mainFrame);
		
		JButton jButtonPause = new JButton("Pause");
		JButton jButtonBack = new JButton("Back");
		
		add(jButtonPause);
		add(jButtonBack);
	}
}
