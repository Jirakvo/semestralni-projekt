package cz.uhk.fim.pro2.game.model;

import java.util.ArrayList;
import java.util.List;

public class World {

	private Bird bird;
	private List<Tube> tubes;
	private List<Heart> hearts;
	
	private static final int SPEED = 100;
	
	public World(Bird bird){
		this.bird = bird;
		this.tubes = new ArrayList<>();
		this.hearts = new ArrayList<>();
	}
	
	public void update(float deltaTime){
		bird.update(deltaTime);
	}
	
	public void addTube(Tube tube){
		this.tubes.add(tube);
	}
	
	public List<Tube> getTubes() {
		return tubes;
	}

	public void setTubes(List<Tube> tubes) {
		this.tubes = tubes;
	}

	public List<Heart> getHearts() {
		return hearts;
	}

	public void setHearts(List<Heart> hearts) {
		this.hearts = hearts;
	}

	public void addHeart(Heart heart){
		this.hearts.add(heart);
	}
	
	public String toString(){
		return
				"Jmeno ptaka: " + bird.getName() + "[ "  + bird.getPositionX() + ", " + bird.getPositionY()+ "]" 
				+ '\n' + "Pocet srdci: " + hearts.size() 
				+ '\n' + "Pocet trubek: " + tubes.size();
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public static int getSpeed() {
		return SPEED;
	}
	
	
}
