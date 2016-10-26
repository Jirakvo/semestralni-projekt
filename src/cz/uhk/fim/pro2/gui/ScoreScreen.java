package cz.uhk.fim.pro2.gui;

import javax.swing.JButton;

public class ScoreScreen extends Screen {

	public ScoreScreen(MainFrame mainFrame){
		super(mainFrame);
		
		JButton jButtonBack = new JButton("Back");
		
		add(jButtonBack);
	}
	
}
