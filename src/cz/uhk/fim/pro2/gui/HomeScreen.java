package cz.uhk.fim.pro2.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class HomeScreen extends Screen {
	
	public HomeScreen(MainFrame mainFrame){
		super(mainFrame);
		
		JButton jButtonPlay = new JButton("Play");
		JButton jButtonScore = new JButton("Score");
		JButton jButtonSound = new JButton("Sound");
		JLabel jLabelTitle = new JLabel("FIM BIRD");
		
		jButtonPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//CO SE STANE KDYZ NA TLACITKO KLIKNU
				mainFrame.setScreen(new GameScreen(mainFrame));
				
			}
		});
		
		jButtonScore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setScreen(new ScoreScreen(mainFrame));
				
			}
		});
		
		jButtonSound.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// metoda na vypnuti zvuku
				
			}
		});
		
		jLabelTitle.setFont(new Font("Arial", Font.BOLD, 40));
		jLabelTitle.setBounds(160, 10, 460, 100);
		
		//nastaveni poyice a velikosti
		jButtonPlay.setBounds(100, 400, 280, 50);
		jButtonScore.setBounds(100, 460, 280, 50);
		jButtonSound.setBounds(100, 520, 280, 50);
		
		
		
		add(jButtonPlay);
		add(jButtonScore);
		add(jButtonSound);
		add(jLabelTitle);
		
		
	}
	
	
}
