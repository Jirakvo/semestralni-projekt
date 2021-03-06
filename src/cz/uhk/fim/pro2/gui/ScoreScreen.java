package cz.uhk.fim.pro2.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ScoreScreen extends Screen {

	public ScoreScreen(MainFrame mainFrame){
		super(mainFrame);
		
		JButton jButtonBack = new JButton("Back");
		
		jButtonBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setScreen(new HomeScreen(mainFrame));
				
			}
		});
		
		jButtonBack.setBounds(20, 20, 80, 60);
		
		jButtonBack.setFont(new Font("Arial", Font.PLAIN, 10));
		jButtonBack.setForeground(Color.GREEN);
		jButtonBack.setBackground(Color.gray);
		
		add(jButtonBack);
	}
	
}
