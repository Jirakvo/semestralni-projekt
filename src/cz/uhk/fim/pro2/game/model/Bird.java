package cz.uhk.fim.pro2.game.model;

import java.awt.Color;

import com.sun.javafx.geom.Rectangle;

import cz.uhk.fim.pro2.gui.MainFrame;


public class Bird {
	private static final int GRAVITY = 300;
	private static final int JUMP = 500;
	private String name;
	private float positionX;
	private float positionY;
	private float speed;
	private float lives;
	
	//sds
	public Bird(String name, float positionX, float positionY){
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
		speed = 0;
		lives = 3;
	}
	
	public void paint(java.awt.Graphics g){
		g.setColor(Color.BLUE);
		
		java.awt.Rectangle rectangle = getRectangle();
		
		g.fillRect(
				(int) rectangle.getX(),
				(int) rectangle.getY(),
				(int) rectangle.getWidth(),
				(int) rectangle.getHeight()
				);
	}
	
	public java.awt.Rectangle getTopRectangle(){
		return new java.awt.Rectangle(
				(int) getPositionX() - 25,
				(int) height ,
				50, 
				(int) (MainFrame.HEIGHT - height)
				);
	}
	
	public java.awt.Rectangle getRectangle(){
		return new java.awt.Rectangle(
				(int)getPositionX() - 25,
				(int)getPositionY() - 25,
				50, 
				50
				);
	}
	
	public void update(float deltaTime){
		positionY -= speed * deltaTime; 
		positionY += GRAVITY * deltaTime;
		
		speed -= speed * deltaTime;
	}
	
	public boolean collideWith(Tube tube){
		java.awt.Rectangle rectangle = getRectangle();
		
		return rectangle.intersects(tube.getBottomRectangle() || rectangle.intersects(tube.getTopRectangle());
	}
	
	public boolean collideWith(Heart heart){	
		return getRectangle().intersection(heart.getRectangle());
	}
	
	public boolean isOutOf(){
		java.awt.Rectangle rectangle = getRectangle();
		
		if(rectangle.getMinX() < 0 || rectangle.getMinY() < 0){
			return true;
		}
		if (condition) {
			
		}	
	}
	
	public void goUp(){
		speed = JUMP;
	}
	
	public String getName(){
		return name;
	}
	
	public float getPositionX(){
		return positionX;
	}
	
	public void setPositionX(float positionX){
		this.positionX = positionX;
	}
	
	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getLives() {
		return lives;
	}

	public void setLives(float lives) {
		this.lives = lives;
	}

	public void setPositionY(float positionY) {
		this.positionY = positionY;
	}

	public float getPositionY(){
		return positionY;
	}
	
	
	public void catchHeart(){
		
	}
	
	public void die(){
		
	}
	
	public void addLive(){
		
	}
	
	public void removeLive(){
		
	}
	
}
