package baseballStats;

import java.util.ArrayList;

public class HitterArray {

	private ArrayList<Hitter> hitters = new ArrayList<Hitter>();
	
	public HitterArray() {
		this.hitters = new ArrayList<Hitter>();
	}
	
	public void addHitter(Hitter h) { hitters.add(h); }
	public Hitter getHitter(int i) { return hitters.get(i); }
	
	public void printHitters() {
		for (int i = 0; i < hitters.size(); i++) {
			hitters.get(i).printSlashLine();
		}
	}
}
