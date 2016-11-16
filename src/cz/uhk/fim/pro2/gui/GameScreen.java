package cz.uhk.fim.pro2.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.Timer;

import com.sun.glass.events.MouseEvent;

import cz.uhk.fim.pro2.game.interfaces.WorldListener;
import cz.uhk.fim.pro2.game.model.Bird;
import cz.uhk.fim.pro2.game.model.Heart;
import cz.uhk.fim.pro2.game.model.Tube;
import cz.uhk.fim.pro2.game.model.World;

public class GameScreen extends Screen implements WorldListener {
	
	private long lastTimeMills;
	
	private Timer timer;
	
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
		
		
		jButtonPause.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (timer.isRunning()) {
					timer.stop();
				}else{
					lastTimeMills = System.currentTimeMillis();
					timer.start();
				}
				
			}
		});
		
		jButtonBack.setBounds(20, 20, 80, 60);
		jButtonPause.setBounds(380, 20, 80, 60);
		
		jButtonBack.setFont(new Font("Arial", Font.PLAIN, 10));
		jButtonBack.setForeground(Color.GREEN);
		jButtonBack.setBackground(Color.gray);
		
		jButtonPause.setFont(new Font("Arial", Font.PLAIN, 10));
		jButtonPause.setForeground(Color.RED);
		jButtonPause.setBackground(Color.gray);
		
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
		
		
		//MouseListener nefunguje
		gameCanvas.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				bird.goUp();
			}
			
		});
			
		timer = new Timer(20, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				long currentTimeMills = System.currentTimeMillis();
				
				float delta = (currentTimeMills - lastTimeMills) / 1000f;
				//System.out.println(delta);
				world.update(delta);
				gameCanvas.repaint();
				
				lastTimeMills = currentTimeMills;
			}
		});
		
		lastTimeMills = System.currentTimeMillis();
		timer.start();
	}

	@Override
	public void crashTube(Tube tube) {
		System.out.println("Crashed into tube");
		
	}

	@Override
	public void catchHeart(Heart heart) {
		System.out.println("Catched heart");
		
	}

	@Override
	public void outOf() {
		System.out.println("Bird flew away");
		
	}
}
