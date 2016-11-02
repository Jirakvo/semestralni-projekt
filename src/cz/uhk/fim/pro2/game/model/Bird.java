package cz.uhk.fim.pro2.game.model;

public class Bird {
	private String name;
	private float positionX;
	private float positionY;
	private float speed;
	private float lives;
	
	/*TODO
	Konstruktor, gettery a settery
	*/
	
	public Bird(String name, float positionX, float positionY){
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
		speed = 0;
		lives = 3;
	}
	
	public String getName(){
		return name;
	}
	
	public float getPositionX(){
		return positionX;
	}
	
	public void setPositionX(float x){
		this.positionX = x;
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
	
	public void goUp(){
		
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
