package cz.uhk.fim.pro2.gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;
	
	protected Screen actualScreen;
 
	public MainFrame(){
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Flappy BIRD");
		setResizable(false);
		setLocationRelativeTo(null);
		
	}
	
	public void setScreen(Screen screen){
		if (actualScreen != null) {
			remove(actualScreen);
		}
		
		add(screen);
		actualScreen = screen;
		revalidate();
		
		/*super.getContentPane().removeAll();
		actualScreen = screen;
		super.getContentPane().add(screen);
		revalidate();*/
	}
	
}
