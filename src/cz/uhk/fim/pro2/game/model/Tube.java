package cz.uhk.fim.pro2.game.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import cz.uhk.fim.pro2.gui.MainFrame;

public class Tube {
	
	private float positionX;
	private float height;
	private Color color;
	
	private static final int GAP = 200;
	
	public Tube(float positionX, float height, Color color) {
		super();
		this.positionX = positionX;
		this.height = height;
		this.color = color;
		
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		
		Rectangle topRectangle = getTopRectangle();
		Rectangle bottomRectangle = getBottomRectangle();
		
		
		g.fillRect((int)getPositionX() - 25, (int) height, 50, (int) (MainFrame.HEIGHT - height));
		
		g.fillRect((int)getPositionX() - 25, 0, 50, (int) (height - GAP));
	}
	
	public Rectangle getTopRectangle(){
		return new Rectangle(
				);
	}
	
	public Rectangle getBottomRectangle(){
		return new Rectangle(
				);
	}
	
	public void update(float deltaTime){
		positionX -= World.getSpeed() * deltaTime;
	}


	public float getPositionX() {
		return positionX;
	}


	public float getHeight() {
		return height;
	}


	public Color getColor() {
		return color;
	}
	
	
	
	
	
	/*TODO
	 * Getter, settery, konstruktor
	 */
	
}
