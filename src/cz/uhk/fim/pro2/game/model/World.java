package cz.uhk.fim.pro2.game.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cz.uhk.fim.pro2.game.interfaces.WorldListener;

public class World {

	private Bird bird;
	private List<Tube> tubes;
	private List<Heart> hearts;
	private WorldListener worldListener;
	
	private static final int SPEED = 100;
	
	public World(Bird bird, WorldListener worldListener){
		this.bird = bird;
		this.tubes = new ArrayList<>();
		this.hearts = new ArrayList<>();
		this.worldListener = worldListener;
	}
	
	public void update(float deltaTime){
		bird.update(deltaTime);
		
		if (bird.isOutOf()) {
			worldListener.outOf();
		}
		
		for(Heart heart : hearts){
			heart.update(deltaTime);
			
			if (bird.collideWith(heart)) {
				worldListener.outOf();
			}
		}
		
		for(Tube tube : tubes){
			tube.update(deltaTime);
			
			if (bird.collideWith(tube)) {
				worldListener.outOf();
			}
		}	
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
