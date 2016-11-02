package cz.uhk.fim.pro2.game.model;

import java.util.ArrayList;
import java.util.List;

public class World {

	private Bird bird;
	private List<Tube> tubes;
	private List<Heart> hearts;
	
	public World(Bird bird){
		this.bird = bird;
		this.tubes = new ArrayList<>();
		this.hearts = new ArrayList<>();
	}
	
	public void addTube(Tube tube){
		this.tubes.add(tube);
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
	
	
}
