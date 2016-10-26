package cz.uhk.fim.pro2.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class HomeScreen extends Screen {
	
	public HomeScreen(MainFrame mainFrame){
		super(mainFrame);
		JButton jButtonPlay = new JButton("Home");
		JButton jButtonScore = new JButton("Score");
		JButton jButtonSound = new JButton("Sound");
		
		jButtonPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//CO SE STANE KDYZ NA TLACITKO KLIKNU
				mainFrame.setScreen(new GameScreen(mainFrame));
				
			}
		});
		
		add(jButtonPlay);
		add(jButtonScore);
		add(jButtonSound);
		
		
	}
	
	
}
