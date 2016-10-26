package cz.uhk.fim.pro2.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GameScreen extends Screen {
	
	public GameScreen(MainFrame mainFrame){
		super(mainFrame);
		
		JButton jButtonPause = new JButton("Pause");
		JButton jButtonBack = new JButton("Back");
		
		jButtonBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setScreen(new HomeScreen(mainFrame));
				
			}
		});
		
		add(jButtonPause);
		add(jButtonBack);
	}
}
