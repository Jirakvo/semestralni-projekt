package cz.uhk.fim.pro2.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import cz.uhk.fim.pro2.game.model.Bird;
import cz.uhk.fim.pro2.game.model.Heart;
import cz.uhk.fim.pro2.game.model.Tube;
import cz.uhk.fim.pro2.game.model.World;

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
		
		jButtonBack.setBounds(20, 20, 60, 60);
		jButtonPause.setBounds(400, 20, 60, 60);
		
		jButtonBack.setFont(new Font("Arial", Font.PLAIN, 10));
		jButtonBack.setForeground(Color.GREEN);
		
		
		add(jButtonPause);
		add(jButtonBack);
		
		//WORLD
		Bird bird = new Bird("Ptak", 240, 400);
		World world = new World(bird);
		world.addTube(new Tube(400, 400, Color.red));
		world.addTube(new Tube(600, 350, Color.red));
		world.addTube(new Tube(800, 530, Color.red));
		
		world.addHeart(new Heart(500, 380));
		world.addHeart(new Heart(700, 480));
		
		GameCanvas gameCanvas = new GameCanvas(world);
		gameCanvas.setBounds(0, 0, MainFrame.WIDTH, MainFrame.HEIGHT);
		add(gameCanvas);
		
	}
}
